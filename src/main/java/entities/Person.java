package entities;

abstract class Person {
    private int id;
    private static int lastId;
    private String name;
    private String lastName;
    private String email;
    private int identificationNumber;


    public Person(String name, String lastName, String email, int identificationNumber){
        this.id = ++lastId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.identificationNumber = identificationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

}
