import java.io.Console;
public class WashCard {
    private int wCardID;
//Should be int
    private int wCardBalance;
    private int cardID = 0;

    public WashCard(int wCardID, int wCardBalance) {
        this.wCardID = wCardID;
        this.wCardBalance = wCardBalance;
    }

    public WashCard(){
        
    }

    public int getWCardBalance(){
        return wCardBalance;
    }



    // public int getWCardID() {
    //     return wCardID;
    // }

    // public String getWCardBalance() {
    //     return wCardBalance;
    // }

    public String toString(){
        return "\nWashcardID: " + wCardID + "\nWashcard balance: " + wCardBalance;
    }

    public void buyWashType(int wCardBalance, String wTypeName, int wTypePrice){
        if (wCardBalance - wTypePrice >= 0){
            wCardBalance = wCardBalance - wTypePrice;
            System.out.println("You bought " + wTypeName + ". Your card balance is " + wCardBalance);
        }
        else{
            System.out.println("You need more money");
        }
    }

    public void printReceipt() {

    }

    public void buyWashCard() {
        Console console = System.console();
        String inputFirstName = console.readLine("What is your first name?\n");

        String inputLastName = console.readLine("What is your last name?\n");
    
        String inputPin = console.readLine("Insert your credit card and enter your PIN\n");

        CreditCard creditCard = new CreditCard("1241589", inputPin, 10100);
//Should have a 1000 kr. limit and wolud be nice if it was a int type 
        int inputAmount = Integer.parseInt(console.readLine("How much money do you want to add to your new wash card?\n"));
        
        cardID++;
        WashCard wCard = new WashCard(cardID, inputAmount);

        Customer customer = new Customer(inputFirstName, inputLastName, creditCard, wCard);

        Owner.addCustomer(customer);

        System.out.println("Your new card ID is: " + cardID + "\nYour card balance is: " + inputAmount + " kr.\n");

        /* if (creditCardBalance - inputAmount >= 0) {
            creditCardBalance = creditCardBalance - inputAmount;
        }
        else {
            System.out.println("Credit card declined");
        } */
        
    } 







}