public class Account {
    private String accountNumber = "123-345";
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    static String lastName = "Lovv";

    /*

     */

    public Account() {
        // Constructor chaining
        this("56789", 2.50, "Default name", "Default address",
                "Default Phone");
        System.out.println("Empty constructor called");
    }


    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;
        this.balance = balance;
        this.name = customerName;
        this.email = email;
        this.phoneNumber = phone;

        System.out.println("His last name is " + Account.lastName);
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your balance is: " + this.balance);
    }

    public void withDraw(double amount) {
        if (this.balance < amount) {
            System.out.println("You don't have enough balance");
        } else {
            this.balance -= amount;
        }
        System.out.println("Your balance is: " + this.balance);
    }

    public void describeAccount() {
        System.out.println("Available balance: " + balance);
    }
}
