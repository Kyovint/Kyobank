package entities;
import Office.Office;

public class Cashier extends Person{
    private Office office;
    public Cashier(String name, String lastName, String email, int identificationNumber, Office office){
        super(name, lastName, email, identificationNumber);
        this.office = office;
    }

    public Object getOffice() {
        return office;
    }
}
