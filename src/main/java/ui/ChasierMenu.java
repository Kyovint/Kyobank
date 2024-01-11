package ui;

import gestor.BankManagement;

import java.util.Scanner;

public class ChasierMenu {

    public static void showChasierMenu(){
        Scanner sc = new Scanner(System.in);
        String name;
        String lastName;
        String email;
        int identificationNumber;
        int idOffice;

        if(BankManagement.isEmptyOfficies()){
            System.out.println("Para crear un cajero es necesario crear sucursales");
        }else {
            try {
                System.out.println("[CREANDO CAJERO]");
                System.out.println("Por favor Escriba el nombre del cajero");
                name = sc.nextLine();
                System.out.println("Por favor Escriba el apellido del cajero");
                lastName = sc.nextLine();
                System.out.println("Por favor Escriba el correo electronico del cajero");
                email = sc.nextLine();
                System.out.println("Por favor Escriba el numero de identificación");
                identificationNumber = sc.nextInt();
                BankManagement.printAllOffices();
                System.out.println("Escriba el id de la sucursal donde trabaja el cajero");
                idOffice = sc.nextInt();
                BankManagement.addCashier(name,lastName,email,identificationNumber, BankManagement.searchOfficeById(idOffice));
            } catch (Exception e) {
                System.out.println("No se pudo crear el cajero");
            }
        }
    }
}
