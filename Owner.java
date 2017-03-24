import java.util.ArrayList;
import java.io.Console;


public class Owner {
    private String username;
    private String password;

    private static ArrayList<Customer> customers = new ArrayList<Customer>();


    public Owner(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static void addCustomer(Customer c){
        customers.add(c);
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void login(String username, String password) {
        Console console = System.console();
        String ownerLogin = console.readLine("Hallo owner. Inter your username\n");
        if(ownerLogin.equals(username)){
            console.readLine("Hallo " + ownerLogin + ". Inter your password\n");

            if(ownerLogin.equals(password)){
                int receiptYesNo = Integer.parseInt(console.readLine("Your options are: \n "));
            }
        }
        
        else{
            System.out.println("Try again");
        }
    }

    public void printCustomers() {
        int customerNumber = 0;
        for(Customer c : customers){
            customerNumber++;
            System.out.println(customerNumber + "." + c);
           }
        }
}