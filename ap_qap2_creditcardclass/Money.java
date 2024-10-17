package ap_qap2_creditcardclass;

public class Money {
    // Initialize the instance variables
    private long dollars;
    private int cents;

    // Parametirized Constructor
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (int) Math.round((amount - dollars) * 100);
    }

    // Copy Constructor
    public Money(Money originObject) {
        this.dollars = originObject.dollars;
        this.cents = originObject.cents;
    }

    // Add & Subtract Methods
    public Money add(Money otherAmount) {
        int newCents = this.cents + otherAmount.cents;
        int carryDollars = newCents / 100;
        newCents = newCents % 100;
        long newDollars = this.dollars + otherAmount.dollars + carryDollars;
        return new Money(newDollars + newCents / 100.0);
    }

    public Money subtract(Money amount) {
        int newCents = this.cents - amount.cents;
        long newDollars = this.dollars - amount.dollars;
        if (newCents < 0) {
            newCents = newCents + 100;
            newDollars = newDollars - 1;
        }
        return new Money(newDollars + newCents / 100.0);
    }

    // Compare & Equals Methods
    public int compareTo(Money amount) {
        if (this.dollars < amount.dollars) {
            return -1;
        } else if (this.dollars > amount.dollars) {
            return 1;
        } else if (this.cents < amount.cents) {
            return -1;
        } else if (this.cents > amount.cents) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Money amount) {
        return (this.dollars == amount.dollars && this.cents == amount.cents);
    }

    // Convert the object to a string
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
