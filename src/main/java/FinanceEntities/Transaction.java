package FinanceEntities;


import entities.Cashier;

public class Transaction {
    private int id = 0;
    private static int lastId = 0;
    private String type;
    private ClientAccount origin;
    private ClientAccount destination;
    private float ammount;
    private Cashier cashier;

    public Transaction(String type, ClientAccount origin, ClientAccount destination, float ammount, Cashier cashier) {
        this.id = ++lastId;
        this.type = type;
        this.origin = origin;
        this.destination = destination;
        this.ammount = ammount;
        this.cashier = cashier;
    }

    public Transaction(String type, ClientAccount destination, float ammount, Cashier cashier) {
        this.id = ++lastId;
        this.type = type;
        this.destination = destination;
        this.ammount = ammount;
        this.cashier = cashier;
    }

    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }

    public ClientAccount getOrigin() {
        return origin;
    }

    public ClientAccount getDestination() {
        return destination;
    }

    public float getAmmount() {
        return ammount;
    }

    public Cashier getCashier() {
        return cashier;
    }
}
