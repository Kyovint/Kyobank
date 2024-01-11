package FinanceEntities;
import entities.Client;
import java.util.Date;


public class ClientAccount {
    private int id = 0;
    private static int lastId = 0;
    private Client client;
    private float balance = 0;
    private Date lastMovement;

    public ClientAccount(Client client, float balance, Date lastMovement){
        this.id = ++lastId;
        this.client = client;
        this.balance = balance;
        this.lastMovement = lastMovement;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public float getBalance() {
        return balance;
    }

    public void setLastMovement(Date lastMovement) {
        this.lastMovement = lastMovement;
    }


    public void addMoney(float money){
        if(money > 0){
            this.balance = this.balance + money;
        }
    }

    public void substractMoney(float money){
        if(money > 0 && money >= this.balance){
            this.balance = this.balance - money;
        }
    }
}
