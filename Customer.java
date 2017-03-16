public class Customer {
    private String firstName;
    private String lastName;
    private int cdNumber;
    private double cdBalance;

    public Customer(String firstName, String lastName, int cdNumber, double cdBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cdNumber = cdNumber;
        this.cdBalance = cdBalance;
    }

    public String getCustomerName() {
        return firstName + lastName;
    }

    public int getCdNumber() {
        return cdNumber;
    }

    public double getCdBalance() {
        return cdBalance;
    }





}