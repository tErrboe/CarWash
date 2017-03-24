import java.io.Console;
public class WashCard {
    private int wCardID;
//Should be int
    private int wCardBalance;
    private int cardID = 0;
    Console console = System.console();

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

    public void addFunds(){
        int inputAmount = Integer.parseInt(console.readLine("Hom much money would you like to add to your card./You can add from 200-1000 kr."));
        if(inputAmount >= 200 && inputAmount <= 1000 && inputAmount + wCardBalance > 1000){
            wCardBalance = wCardBalance + inputAmount;
            System.out.println(wCardBalance);
        }
        else{
            System.out.println("Max value of total amount is 1000");
        }
    }

    public void buyWashCard() {
        String inputFirstName = console.readLine("What is your first name?\n");

        String inputLastName = console.readLine("What is your last name?\n");
    
        int inputPin = Integer.parseInt(console.readLine("Insert your credit card and enter your PIN\n"));

        CreditCard creditCard = new CreditCard("1241589", inputPin, 10100);

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