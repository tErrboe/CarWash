public class CreditCard {

//should be int
    private String pin;
    private String creditCardNumber;
    private int creditCardBalance;

    public CreditCard(String creditCardNumber, String pin, int creditCardBalance) {
        this.pin = pin;
        this.creditCardBalance = creditCardBalance;

    }

    public String toString() {
        return "Creditcard number: " + creditCardNumber + "Creditcard balance: " + creditCardBalance;
        
    }
}