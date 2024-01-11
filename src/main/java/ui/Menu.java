package ui;

import java.util.Scanner;
public class Menu {
    public static void showMainMenu(){
        Scanner sc = new Scanner(System.in);

        int response;
        do{
            System.out.println("Bienvenido a KyoBank, ¿Que accion desea realizar?");
            System.out.println("1. Agregar una oficina");
            System.out.println("2. Agregar un funcionario");
            System.out.println("3. Agregar un cliente");
            System.out.println("4. Crear una cuenta bancaria");
            System.out.println("5. Realizar una transaccion");
            response = sc.nextInt();
            switch (response){
                case 1:
                    OfficeMenu.showOfficeMenu();
                    break;
                case 2:
                    ChasierMenu.showChasierMenu();
                    break;
                case 3:
                    ClientMenu.showClientMenu();
                    break;
                case 4:
                    AccountMenu.ShowAccountMenu();
                    break;
                case 5:
                    TransactionMenu.showTransactionMenu();
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
                    break;
            }
        }while (response != 0);
    }
}
