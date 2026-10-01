public class Account {
    //Gör owner och balance private. 
    private String owner;
    private double balance;
    
    //Lägg till en konstruktor.
    public Account(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }
    //Lägg till getters för owner och balance. 
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    //Behåll deposit/withdraw metoderna. 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

}
