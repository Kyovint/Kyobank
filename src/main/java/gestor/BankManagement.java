package gestor;

import FinanceEntities.ClientAccount;
import FinanceEntities.Transaction;
import Office.Office;
import entities.Cashier;
import entities.Client;

import java.util.Iterator;

import java.util.Date;
import java.util.LinkedHashSet;

public class BankManagement {
    public static LinkedHashSet<Office> offices = new LinkedHashSet<>();
    public static LinkedHashSet<Cashier> cashiers = new LinkedHashSet<>();
    public static LinkedHashSet<Client> clients = new LinkedHashSet<>();
    public static LinkedHashSet<ClientAccount> accounts = new LinkedHashSet<>();
    public static LinkedHashSet<Transaction> transactions = new LinkedHashSet<>();

    public static void addOffice(String officeName, String officeCity, int phoneContact){
        try{
            offices.add(new Office(officeName, officeCity, phoneContact));
        }catch (Exception e){
            System.out.println("[ERROR]: No se pudo crear la oficina");
        }

    }
    public static void addCashier(String name, String lastName, String email, int identificationNumber, Office office){
        if(office == null){
            System.out.println("[ERROR] Oficina no encontrada!");
        }else{
            try{
                cashiers.add(new Cashier(name,lastName,email,identificationNumber,office));
            }catch (Exception e){
                System.out.println("[ERROR] No se pudo crear el cajero");
            }
        }
    }
    public static void addClient(String name, String lastName, String email, int identificationNumber, String city,
                                 String address, float incomes, float expenses, String profession){
        try{
            clients.add(new Client(name,lastName,email,identificationNumber,city,address,incomes,expenses,profession));
            for (Client element: clients) {
                System.out.println(element.getId()+" || "+element.getName() + " || "+element.getCity());
                System.out.println("-------------------------------");
            }
        }catch (Exception e){
            System.out.println("[ERROR] No se pudo crear el cliente");
        }

    }

    public static void addAccount(Client client){
        if(client == null){
            System.out.println("[ERROR] El cliente no fue encontrado");
        }else {
            accounts.add(new ClientAccount(client, 0, new Date()));
        }
    }

    public static void addTransaction(String type, int origin, int destination, float ammount){
        //Find the first cashier for examples uses
        Iterator<Cashier> iterator = cashiers.iterator();
        Cashier actualCashier = iterator.next();

        ClientAccount destinationAccount = searchAccountById(destination);
        if(destinationAccount == null){
            System.out.println("[ERROR] No se encuentra cuenta origin o destino");
        }else{
            switch (type) {
                case "Deposit":
                    transactions.add(new Transaction(type,destinationAccount,ammount,actualCashier));
                    destinationAccount.addMoney(ammount);
                    System.out.println(destinationAccount.getBalance());
                    break;
                case "Transference":
                    ClientAccount originAccount = searchAccountById(origin);
                    if(originAccount != null) {
                        transactions.add(new Transaction(type, originAccount, destinationAccount,ammount,actualCashier));
                        if(originAccount.getBalance() > ammount){
                            originAccount.setLastMovement(new Date());
                            destinationAccount.setLastMovement(new Date());
                            originAccount.substractMoney(ammount);
                            destinationAccount.addMoney(ammount);
                        }else{
                            System.out.println("Fondos insuficientes de la cuenta de origen");
                        }
                    }
                    break;
            }
        }
    }
    public static void printAllOffices(){
        System.out.println("LISTADO DE OFICINAS DISPONIBLES");
        System.out.println("-------------------------------");
        System.out.println("ID || Nombre oficina || Ciudad de oficina");
        for (Office element: offices) {
            System.out.println(element.getId()+" || "+element.getName() + " || "+element.getCity());
            System.out.println("-------------------------------");
        }
    }

    public static boolean isEmptyOfficies(){
        return offices.isEmpty();
    }
    public static boolean isEmptyCashiers(){return cashiers.isEmpty();}
    public static boolean isEmptyClients(){return clients.isEmpty();}
    public static Office searchOfficeById(int idToSearch){
        for (Office element: offices) {
            if(element.getId() == idToSearch){
                return element;
            }
        }
        return null;
    }

    public static ClientAccount searchAccountById(int idToSearch){
        for (ClientAccount element: accounts) {
            if(element.getId() == idToSearch){
                return element;
            }
        }
        return null;
    }

    public static Client searchClientById(int clientId){
        for (Client element: clients) {
            if(element.getId() == clientId){
                return element;
            }
        }
        return null;
    }
    public static boolean hasClientAccount(int clientId){
        for (ClientAccount element: accounts) {
            if(element.getClient().getId() == clientId){
                return true;
            }
        }
        return false;
    }
}
