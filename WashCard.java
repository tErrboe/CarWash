public class WashCard {
    private int wCardID;
    private int wCardBalance;

    public WashCard(int wCardID, int wCardBalance) {
        this.wCardID = wCardID;
        this.wCardBalance = wCardBalance;
    }

    public int getWCardID() {
        return wCardID;
    }

    public int getWCardBalance() {
        return wCardBalance;
    }

    public void printReceipt() {
    }

    public void buyWashCard() {
        String inputFirstName = console.readLine("What is your first name?");

        String inputLastName = console.readLine("What is your last name?");
    
        String inputPin = console.readLine("Insert your credit card and enter your PIN");

        int inputAmount = console.readLine("How much moeny do you want to add to your new wash card?");
        

        /* if (creditCardBalance - inputAmount >= 0) {
            creditCardBalance = creditCardBalance - inputAmount;
        }
        else {
            System.out.println("Credit card declined");
        } */
        
    } 







}