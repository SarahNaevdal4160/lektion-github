import java.util.ArrayList;

public class AccountRegister {
    //Instance variable to hold a list of accounts.
    private ArrayList<Account> accounts;

    //Constructor to initialize the account register.
    public AccountRegister() {
        this.accounts = new ArrayList<>();
    }

    //Method to add an account to the register.
    public void createAccount(String owner, double initialBalance) {
        Account newAccount = new Account(owner, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account added for " + owner + " with initial balance: " + initialBalance);
    }
   
    //Method to get the list of accounts.
    public void listAccounts() {
        System.out.println("Listing all accounts:");
        //Check if the accounts list is empty before proceeding to list accounts.
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            //Do not proceed further if there are no accounts to list.
            return;
        } 
        else {
            //Iterate through the accounts list and print each account's owner and balance.
            for (Account account : accounts) {
                System.out.println("Owner: " + account.getOwner() + ", Balance: " + account.getBalance());
            }
        }
    }

    //Method to find an account by owner name.
    public Account findAccount(String owner) {
        for (Account account : accounts) {
            if (account.getOwner().equals(owner)) {
                return account;
            }
        }
        //Found no account with the given owner name.
        System.out.println("Account not found for owner: " + owner);
        return null;
    }
}
