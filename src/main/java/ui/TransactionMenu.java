package ui;

import gestor.BankManagement;

import java.util.Scanner;

public class TransactionMenu {

    public static void showTransactionMenu(){
        Scanner sc = new Scanner(System.in);
        int optionSelected = 0;
        int origin = 0;
        int destination = 0;
        float ammount;
        String type;
        System.out.println("REGISTRO DE TRANSACCIONES");
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Deposito a cuenta");
            System.out.println("2. Transferencia entre cuentas");
            System.out.println("4. volver al menu principal");
            optionSelected = sc.nextInt();
            switch (optionSelected){
                case 1:
                    System.out.println("DEPOSITAR DINERO A CUENTA");
                    System.out.println("Digite el id de la cuenta");
                    destination = sc.nextInt();
                    System.out.println("Digite la cantidad de dinero a depositar");
                    ammount = sc.nextFloat();
                    type = "Deposit";
                    BankManagement.addTransaction(type,origin,destination,ammount);
                    break;
                case 2:
                    System.out.println("TRANSFERENCIA ENTRE CUENTAS");
                    System.out.println("Digite el id de la cuenta origen");
                    origin = sc.nextInt();
                    System.out.println("Digite el id de la cuenta destino");
                    destination = sc.nextInt();
                    System.out.println("Digite la cantidad de dinero a transferir");
                    ammount = sc.nextFloat();
                    type = "Transference";
                    BankManagement.addTransaction(type,origin,destination,ammount);
                    break;
                case 3:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }while (optionSelected != 3);
    }
}
