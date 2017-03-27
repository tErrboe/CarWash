import java.io.Console;
import java.util.ArrayList;

public class WashCard {
    private int wCardID;
    private int wCardBalance;
    private int cardID = 0;
    private int washCounter = 0;
    private int turnover = 0;
    Console console = System.console();
// ArrayList for turnover (omsætning)
    // private ArrayList<Turnover> turnover = new ArrayList<Turnover>();

    public WashCard(int wCardID, int wCardBalance) {
        this.wCardID = wCardID;
        this.wCardBalance = wCardBalance;
    }

    public WashCard(){
        
    }

    public int getWCardBalance(){
        return wCardBalance;
    }

    public void printTurnover(){
        System.out.println("Number of washes: " + washCounter + "\nTurnover: " + turnover);
    }

    public String toString(){
        return "\nWashcardID: " + wCardID + "\nWashcard balance: " + wCardBalance;
    }

    public void buyWashType(String wTypeName, int wTypePrice){
        if (wCardBalance - wTypePrice >= 0){
            wCardBalance = wCardBalance - wTypePrice;
            System.out.println("You bought " + wTypeName + ". Your card balance is " + wCardBalance + "\nThank you for your purchase.");
            int receiptYesNo = Integer.parseInt(console.readLine("Would you like a receipt?\nPress 1 for 'Yes' or press 2 for 'No'\n"));
            washCounter++;
            turnover = wTypePrice + turnover;
            if (receiptYesNo == 1) {
                System.out.println("------------Receipt------------\n" + "\nYour wash: " + wTypeName + "\nPrice: " + wTypePrice + " kr.\nRemaining Card Balance: " + wCardBalance + " kr.\n\nThank you, please come again\n\n-------------------------------");
            }
            else if (receiptYesNo == 2) {
                System.out.println("Thank you, please come again");
            }
        }
        else{
            System.out.println("You need more money");
        }
    }

    public void printReceipt() {

    }

    public void addFunds(){
        int inputAmount = Integer.parseInt(console.readLine("Hom much money would you like to add to your card.\nYou can add from 200-1000 kr.\n"));
        if(inputAmount >= 200 && inputAmount <= 1000 && inputAmount + wCardBalance <= 1000){
            wCardBalance = wCardBalance + inputAmount;
            System.out.println("Your new balance is " + wCardBalance + "kr.\n");
        }
        else if(inputAmount < 200 || inputAmount > 1000) {
            System.out.println("Please insert between 200 and 1000 kr\n");
        }
        else {
            System.out.println("You cannot have more than 1000 kr on your card\n");
        }
    }

    public void buyWashCard() {
        String inputFirstName = console.readLine("What is your first name?\n");

        String inputLastName = console.readLine("What is your last name?\n");
    
        int inputPin = Integer.parseInt(console.readLine("Insert your credit card and enter your PIN\n"));

        CreditCard creditCard = new CreditCard("1241589", inputPin, 10100);

        int inputAmount = Integer.parseInt(console.readLine("How much money do you want to add to your new wash card?\n"));

        while (inputAmount < 200 || inputAmount > 1000) {
                 inputAmount = Integer.parseInt(console.readLine("You cannot have less than 200 kr and more than 1000 kr on your card. Please try again.\n"));
        }
        
        if(inputAmount >= 200 && inputAmount <= 1000) {
            cardID++;
        WashCard wCard = new WashCard(cardID, inputAmount);

        Customer customer = new Customer(inputFirstName, inputLastName, creditCard, wCard);

        Owner.addCustomer(customer);

        System.out.println("Your new card ID is: " + cardID + "\nYour card balance is: " + inputAmount + " kr.\n");
        }
    } 
}