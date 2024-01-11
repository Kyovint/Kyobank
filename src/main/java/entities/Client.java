package entities;

public class Client extends Person{
    private String city;
    private String address;
    private float incomes;
    private float expenses;
    private String profession;
    public Client(String name, String lastName, String email, int identificationNumber, String city, String address){
        super(name, lastName, email, identificationNumber);
        this.city = city;
        this.address = address;
    }

    public Client(String name, String lastName, String email, int identificationNumber, String city, String address, float incomes, float expenses, String profession) {
        super(name, lastName, email, identificationNumber);
        this.city = city;
        this.address = address;
        this.incomes = incomes;
        this.expenses = expenses;
        this.profession = profession;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getIncomes() {
        return incomes;
    }

    public void setIncomes(float incomes) {
        this.incomes = incomes;
    }

    public float getExpenses() {
        return expenses;
    }

    public void setExpenses(float expenses) {
        this.expenses = expenses;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
