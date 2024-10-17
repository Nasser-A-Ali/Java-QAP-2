package ap_qap2_creditcardclass;

public class CreditCard {
    // Initialize the instance variables
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Paramaterized Constructor
    public CreditCard(Person newCardholder, Money limit) {
        this.owner = newCardholder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0.00);
    }

    // Getter Methods
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    // Charge & Payment Methods
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            System.out.println("Charge: " + amount);
            balance = balance.add(amount);
        } else {
            System.out.println("Sorry, this transaction would exceed your credit limit.");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
