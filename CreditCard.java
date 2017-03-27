public class CreditCard {

//should be int
    private int pin;
    private int creditCardNumber;
    private int creditCardBalance;

    public CreditCard(int creditCardNumber, int pin, int creditCardBalance) {
        this.pin = pin;
        this.creditCardBalance = creditCardBalance;
        this.creditCardNumber = creditCardNumber;

    }

    public String toString() {
        return "Creditcard number: " + creditCardNumber + "Creditcard balance: " + creditCardBalance;

    }
}