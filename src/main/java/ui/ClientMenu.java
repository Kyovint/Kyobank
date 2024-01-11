package ui;

import gestor.BankManagement;

import java.util.Scanner;

public class ClientMenu {

    public static void showClientMenu(){
        Scanner sc = new Scanner(System.in);
        String name;
        String lastName;
        String email;
        int identificationNumber;
        String city;
        String address;
        float incomes;
        float expenses;
        String profession;
        if(BankManagement.isEmptyOfficies() ||  BankManagement.isEmptyCashiers()){
            System.out.println("Es necesario crear por lo menos una oficina y un cajero para crear un cliente");
        }else {
            try {
                System.out.println("[CREANDO CLIENTE]");
                System.out.println("Por favor Escriba el nombre del cliente");
                name = sc.nextLine();
                System.out.println("Por favor Escriba el apellido del cliente");
                lastName = sc.nextLine();
                System.out.println("Por favor Escriba el correo electronico del cliente");
                email = sc.nextLine();
                System.out.println("Por favor Escriba el numero de identificación del cliente");
                identificationNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("Por favor Escriba la ciudad del cliente");
                city = sc.nextLine();
                System.out.println("Por favor Escriba la direccion del cliente");
                address = sc.nextLine();
                System.out.println("Por favor Escriba la profesion del cliente");
                profession = sc.nextLine();
                System.out.println("Por favor Escriba los ingresos mensuales del cliente");
                incomes = sc.nextFloat();
                System.out.println("Por favor Escriba los egresos mensuales del cliente");
                expenses = sc.nextFloat();
                BankManagement.addClient(name,lastName,email,identificationNumber,city,address,incomes,expenses,profession);
            } catch (Exception e) {
                System.out.println("No se pudo crear el cliente");
            }
        }
    }
}
