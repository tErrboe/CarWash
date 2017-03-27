public class Customer {
    private String firstname;
    private String lastname;
    private CreditCard creditCard;
    private WashCard washCard;

    

    public Customer(String firstname, String lastname, CreditCard creditCard, WashCard washCard) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.creditCard = creditCard;
        this.washCard = washCard;
    }

    public String toString(){
        return "\n" + "Firstname: " + firstname + "\nLastname: " + lastname + washCard + "\n\n";
    }


    
    





}