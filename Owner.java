import java.util.ArrayList;
import java.io.Console;


public class Owner {
    private String username = "admin";
    private String password = "1234";

    WashCard wc = new WashCard();

    private static ArrayList<Customer> customers = new ArrayList<Customer>();


    public Owner(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static void addCustomer(Customer c){
        customers.add(c);
    }

    public void login() {
        Console console = System.console();
        boolean loggedIn = true;
        String ownerLogin = console.readLine("Hallo owner. Enter your username\n");
        
        while (loggedIn == true) { 
        if(ownerLogin.equals(username)){
            ownerLogin = console.readLine("Hallo " + ownerLogin + ". Enter your password\n");

            if(ownerLogin.equals(password)){
                int ownerOptions = Integer.parseInt(console.readLine("Your options are: \n1: Print customers\n2: Print turnover\n"));

                if(ownerOptions == 1){
                    int customerNumber = 0;
                    for(Customer c : customers){
                    customerNumber++;
                    System.out.println(customerNumber + "." + c);
                
                    }
                }
                
                else if(ownerOptions == 2){
                    wc.printTurnover();
                }
                String logout = console.readLine("Here are the statistics for the day. Press '1' to log out.");
                 if (logout.equalsIgnoreCase("1")) {
                        loggedIn = false;
                }
            }
        }
        

        else{
            System.out.println("Try again");
        }
        }
    }
}