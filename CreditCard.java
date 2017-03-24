public class CreditCard {

//should be int
    private int pin;
    private String creditCardNumber;
    private int creditCardBalance;

    public CreditCard(String creditCardNumber, int pin, int creditCardBalance) {
        this.pin = pin;
        this.creditCardBalance = creditCardBalance;

    }

    public String toString() {
        return "Creditcard number: " + creditCardNumber + "Creditcard balance: " + creditCardBalance;

    }
}