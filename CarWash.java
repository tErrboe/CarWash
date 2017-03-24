import java.io.Console;

public class CarWash {
    public static void main(String[] args) {
        Console console = System.console();

        Owner owner = new Owner("admin", "1234");

        WashType[] washtypes = new WashType[4];
        washtypes[0] = new WashType("Bronze", 200);
        washtypes[1] = new WashType("Silver", 300);
        washtypes[2] = new WashType("Gold", 500);
        washtypes[3] = new WashType("Diamond", 1000);

        WashCard washCard = new WashCard();

        
        for(int i = 0; i < 1;){
        
            String optionsInput = console.readLine("Hello and welcome to the car wash. How would you like to proceed?\nThese are your options:\n1: Insert Wash Card\n2: Buy Wash Card\n");

//Option 1 = inserting wash card to buy wash, check balance or insert money
            if(optionsInput.equals("1")){
                WashCard wc1 = new WashCard(999, 1000);
                System.out.println(wc1);
                System.out.println("");
                String optionsInput1 = console.readLine("Your options are: \n1: Buy wash \n2: Insert money on card\n");
                if(optionsInput1.equals("1")){
                    String orderInput = console.readLine("Which wash type do you want?\n1: " + washtypes[0] + "\n2: " + washtypes[1] + "\n3: " + washtypes[2] + "\n4: " + washtypes[3] + "\n");
                    if(orderInput.equals("1")){
                        wc1.buyWashType(wc1.getWCardBalance(), washtypes[0].getWTypeName(), washtypes[0].getWTypePrice());
                    }

                    else if(orderInput.equals("2")){
                        wc1.buyWashType(wc1.getWCardBalance(), washtypes[1].getWTypeName(), washtypes[1].getWTypePrice());
                    }

                    else if(orderInput.equals("3")){
                        wc1.buyWashType(wc1.getWCardBalance(), washtypes[2].getWTypeName(), washtypes[2].getWTypePrice());
                    }

                    else if(orderInput.equals("4")){
                        wc1.buyWashType(wc1.getWCardBalance(), washtypes[3].getWTypeName(), washtypes[3].getWTypePrice());
                    }
                }

                else if(optionsInput1.equals("2")){

                }

                System.out.println("");
            }
//Option 2 = buy wash card
            else if(optionsInput.equals("2")){
                washCard.buyWashCard();
            }

            else if(optionsInput.equals("123")){
                // boolean success = false;
                owner.login(owner.getUsername(), owner.getPassword());
            }

            else if(optionsInput.equals("000")){
                i++;
            }
//Error message should be changed and after error should it return to start
            else {
                System.out.println("Try again");
            }
        }

        owner.printCustomers();



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