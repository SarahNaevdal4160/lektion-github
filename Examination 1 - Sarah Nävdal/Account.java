public class Account {
    //Instance variables. Private variables are only accessible within the class.
    private String owner;
    private double balance;

    //Constructor to initialize the account.
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
}

    //Getter method for owner.
    public String getOwner() {
        return owner;
}
    //Getter method for balance.
    public double getBalance() {
        return balance;
}

    //Method to deposit money into the account.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
}

    //Method to withdraw money from the account.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New balance: " + balance);
        //If the withdrawal amount is greater than the balance, print an error message.
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        //If the withdrawal amount is not positive, print an error message.
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }

    }
}