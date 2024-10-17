package ap_qap2_creditcardclass;

public class Address {
    // Initialize the instance variables
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Covert the object to a string
    public String toString() {
        return street + ", " + city + ", " + state + "\n" + zip;
    }
}
