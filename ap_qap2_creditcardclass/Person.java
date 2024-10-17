package ap_qap2_creditcard;

public class Person {
    // Initialize the instance variables
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // Covert the object to a string
    public String toString() {
        return firstName + " " + lastName + ", " + home;
    }
}
