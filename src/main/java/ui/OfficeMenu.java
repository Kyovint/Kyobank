package ui;

import gestor.BankManagement;
import java.util.Scanner;

public class OfficeMenu {
    public static void showOfficeMenu(){
        Scanner sc = new Scanner(System.in);
        String officeName;
        String officeCity;
        int officePhoneContact;
        try{
            System.out.println("[AGREGANDO OFICINA]");
            System.out.println("Por favor Escriba El nombre de la oficina");
            officeName =  sc.nextLine();
            System.out.println("Por favor Escriba la Ciudad de la oficina");
            officeCity =  sc.nextLine();
            System.out.println("Por favor Escriba el telefono de contacto de la oficina");
            officePhoneContact = sc.nextInt();
            BankManagement.addOffice(officeName,officeCity,officePhoneContact);
        }catch (Exception e){
            System.out.println("No se pudo crear la oficina");
        }
    }
}
