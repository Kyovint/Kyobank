package ui;

import java.util.Scanner;
public class Menu {
    public static void showMainMenu(){
        Scanner sc = new Scanner(System.in);

        int response;
        do{
            System.out.println("¿Que accion desea realizar?");
            System.out.println("1. Agregar una sucursal");
            System.out.println("2. Agregar un cajero al sistema");
            System.out.println("3. Agregar un nuevo cliente");
            System.out.println("4. Crear una cuenta bancaria para un usuario");
            System.out.println("5. Realizar una transaccion entre cuentas bancarias");
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
                    System.out.println("Seleccione una opcion valida, por favor");
                    break;
            }
        }while (response != 0);
    }
}
