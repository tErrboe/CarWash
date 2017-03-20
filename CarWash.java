import java.io.Console;

public class CarWash {
    public static void main(String[] args) {
        Console console = System.console();

        WashType[] washtypes = new WashType[4];
        washtypes[0] = new WashType("Bronze", 200);
        washtypes[1] = new WashType("Silver", 300);
        washtypes[2] = new WashType("Gold", 500);
        washtypes[3] = new WashType("Diamond", 1000);

        Customer c1 = new Customer("Lars", "Hansen", creditCard, washCard);
        
        String optionsInput = console.readLine("Hello and welcome to the car wash. How would you like to proceed?\nThese are your options:\nInsert Wash Card\nBuy Wash Card\n");


      
        c1.buyWashCard();
       // if (optionsInput.equalsIgnoreCase("Buy") || optionsInput.equalsIgnoreCase("buy wash card") ) {
            
       // }



       /* if (optionsInput.equalsIgnoreCase("wash car")) {
            String w = "1: " + washtypes[0].getWTypeName() + ", " + washtypes[0].getWTypePrice() + "kr\n" + "2: " + washtypes[1].getWTypeName() + ", " + washtypes[1].getWTypePrice() + "kr\n" + "3: " +  washtypes[2].getWTypeName() + ", " + washtypes[2].getWTypePrice() + "kr\n" + "4: " + washtypes[3].getWTypeName() + ", " + washtypes[3].getWTypePrice() + "kr\n";

            String wTypeInput = console.readLine("What type of car wash would you like?\nThese are your options:\n" + w);

            if (wTypeInput.equalsIgnoreCase("Bronze") || wTypeInput.equalsIgnoreCase("1")) {
                System.out.println("You have chosen " + washtypes[0].getWTypeName() + ". " + washtypes[0].getWTypePrice() + "kr will be deducted from your balance. Your new balance is 200 kr");
            }
            else if(wTypeInput.equalsIgnoreCase("Silver") || wTypeInput.equalsIgnoreCase("2")) {
                System.out.println("You have chosen " + washtypes[1].getWTypeName() + ". " + washtypes[1].getWTypePrice() + "kr will be deducted from your balance. Your new balance is 200 kr");

            } 
            else if(wTypeInput.equalsIgnoreCase("Gold") || wTypeInput.equalsIgnoreCase("3")) {
                System.out.println("You have chosen " + washtypes[2].getWTypeName() + ". " + washtypes[2].getWTypePrice() + "kr will be deducted from your balance. Your new balance is 200 kr");

            }
            else if(wTypeInput.equalsIgnoreCase("Diamond") || wTypeInput.equalsIgnoreCase("4")) {
                System.out.println("You have chosen " + washtypes[3].getWTypeName() + ". " + washtypes[3].getWTypePrice() + "kr will be deducted from your balance. Your new balance is 200 kr");

            }
        }

//|| optionsInput.equalsIgnoreCase("add funds"))

*/

    }
}