package Office;

public class Office{
    private int id;
    private static int lastId;
    private String name;
    private String city;
    private int phoneContact;

    public Office(String name, String city, int phoneContact) {
        this.id = ++lastId;
        this.name = name;
        this.city = city;
        this.phoneContact = phoneContact;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(int phoneContact) {
        this.phoneContact = phoneContact;
    }

}
