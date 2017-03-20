public class Customer {
    private String firstName;
    private String lastName;
    private CreditCard creditCard;
    private WashCard washCard;

    public Customer(String firstName, String lastName, CreditCard creditCard, WashCard washCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCard = creditCard;
        this.washCard = washCard;
    }

    public String getCustomerName() {
        return firstName + lastName;
    }


    
    





}