package cf.mindaugas._03_spring_di_xml.model;

// Model -> class that represents an object created from a databased record
public class Customer {
    private String firstname;
    private String lastname;
    public Customer () {}
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}