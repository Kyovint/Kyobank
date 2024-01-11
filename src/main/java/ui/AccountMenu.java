package ui;

import gestor.BankManagement;

import java.util.Scanner;

public class AccountMenu {
    public static void ShowAccountMenu(){
        Scanner sc = new Scanner(System.in);
        int clientId;

        if(BankManagement.isEmptyClients()){
            System.out.println("Para crear una cuenta debe crearse un cliente");
        }else {
            try {
                System.out.println("[CREANDO CUENTA A CLIENTE]");
                System.out.println("Por favor Escriba el id del cliente");
                clientId = sc.nextInt();
                if(!BankManagement.hasClientAccount(clientId)){
                    BankManagement.addAccount(BankManagement.searchClientById(clientId));
                }else{
                    System.out.println("[ERROR] El usuario ya tiene una cuenta asociada");
                }
            } catch (Exception e) {
                System.out.println("No se pudo crear el cajero");
            }
        }

    }
}
