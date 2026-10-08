import java.util.Scanner; // Import the Scanner class for user input.
import java.util.InputMismatchException; // Import the InputMismatchException class to handle invalid input.

public class Main { // Declare the Main class, which contains the main method to run the program.
    public static void main(String[] args) { // Main method, the entry point of the program.
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input.
        AccountRegister accountRegister = new AccountRegister(); // Create an AccountRegister object to manage bank accounts.
        boolean exit = false; // Initialize exit variable to control the program loop.

        while (!exit) {
            System.out.println("\nBank Account Management System"); // Title of the program.
            System.out.println("1. Create Account"); // Message to the user to create an account.
            System.out.println("2. List Accounts"); // Message to the user to list all accounts.
            System.out.println("3. Deposit"); // Message to the user to deposit money into an account.
            System.out.println("4. Withdraw"); // Message to the user to withdraw money from an account.
            System.out.println("5. Exit"); // Message to the user to exit the program.
            System.out.print("Choose an option: "); // Prompt the user to choose an option.

            int choice = 0; // Initialize choice variable to store user input.
            try {
                choice = scanner.nextInt(); // Read the user's choice from input.
                scanner.nextLine(); // Consume newline.
            } catch (InputMismatchException e) { // Catch the InputMismatchException if the user enters invalid input (non-integer).
                System.out.println("Invalid input. Please enter a number between 1 and 5."); // Handle invalid input by displaying an error message.
                scanner.nextLine(); // Clear the invalid input.
                continue; // Skip to the next iteration of the loop.
            }

            switch (choice) { // Switch statement to handle user choices.
                case 1:
                    System.out.print("Enter owner name: "); // Prompt the user to enter the owner's name for the new account.
                    String owner = scanner.nextLine(); // Read the owner's name from user input.
                    double initialBalance = 0; // Initialize initialBalance variable to store the initial balance for the new account.
                    try {
                        System.out.print("Enter initial balance: "); // Prompt the user to enter the initial balance for the new account.
                        initialBalance = scanner.nextDouble(); // Read the initial balance from user input.
                        scanner.nextLine(); // Consume newline
                    } catch (InputMismatchException e) { // Catch the InputMismatchException if the user enters invalid input for the initial balance.
                        System.out.println("Invalid input for balance. Please enter a valid number."); // Display an error message to the user.
                        scanner.nextLine(); // Clear the invalid input
                        break; // Exit the case block
                    }
                    accountRegister.createAccount(owner, initialBalance); // Call the createAccount method on the accountRegister object to create a new account with the provided owner name and initial balance.
                    break; // End of case 1 block.
                case 2:
                    accountRegister.listAccounts(); // Call the listAccounts method on the accountRegister object to display all existing accounts.
                    break; // End of case 2 block.
                case 3:
                    System.out.print("Enter owner name for deposit: "); // Prompt the user to enter the owner's name for the account to deposit into.
                    String depositOwner = scanner.nextLine(); // Read the owner's name from user input.
                    Account depositAccount = accountRegister.findAccount(depositOwner); // Call the findAccount method on the accountRegister object to find the account associated with the provided owner name.
                    if (depositAccount != null) { // Check if the account exists (not null).
                        System.out.println("Current balance: " + depositAccount.getBalance() + "kr"); // Display the current balance of the account before the deposit.
                        double depositAmount = 0; // Initialize depositAmount variable to store the amount to deposit.
                        try {
                            System.out.print("Enter amount to deposit: "); // Prompt the user to enter the amount to deposit.
                            depositAmount = scanner.nextDouble(); // Read the deposit amount from user input.
                            scanner.nextLine(); // Consume newline
                        } catch (InputMismatchException e) { // Catch the InputMismatchException if the user enters invalid input for the deposit amount.
                            System.out.println("Invalid input for deposit amount. Please enter a valid number."); // Display an error message to the user.
                            scanner.nextLine(); // Clear the invalid input
                            break; // Exit the case block
                        }
                        depositAccount.deposit(depositAmount); // Call the deposit method on the account object to perform the deposit operation with the specified amount.
                    } 
                    else {
                        System.out.println("Account not found for owner: " + depositOwner); // Display an error message if the account is not found for the provided owner name.
                    }
                    break; // End of case 3 block.

                case 4:
                    System.out.print("Enter owner name for withdrawal: "); // Prompt the user to enter the owner's name for the account to withdraw from.
                    String withdrawOwner = scanner.nextLine(); // Read the owner's name from user input.
                    Account withdrawAccount = accountRegister.findAccount(withdrawOwner); // Call the findAccount method on the accountRegister object to find the account associated with the provided owner name.
                    if (withdrawAccount != null) { // Check if the account exists (not null).
                        System.out.println("Current balance: " + withdrawAccount.getBalance() + "kr"); // Display the current balance of the account before the withdrawal.
                        System.out.flush(); // Flush the output stream to ensure that the current balance is displayed before prompting for withdrawal amount.
                        double withdrawAmount = 0; // Initialize withdrawAmount variable to store the amount to withdraw.
                        try { // Start of try block to handle potential InputMismatchException.
                            System.out.print("Enter amount to withdraw: "); // Prompt the user to enter the amount to withdraw.
                            withdrawAmount = scanner.nextDouble(); // Read the withdrawal amount from user input.
                            scanner.nextLine(); // Consume newline.
                        } catch (InputMismatchException e) { // Catch the InputMismatchException if the user enters invalid input.
                            System.out.println("Invalid input for withdrawal amount. Please enter a valid number."); // Display an error message to the user.
                            scanner.nextLine(); // Clear the invalid input.
                            break; // Exit the case block.
                        }
                        withdrawAccount.withdraw(withdrawAmount); // Call the withdraw method on the account object to perform the withdrawal.
                    } 
                    else {
                        System.out.println("Account not found for owner: " + withdrawOwner); // Display an error message if the account is not found.
                    }
                    break; // End of case 4 block.
                case 5:
                    System.out.println("Exiting..."); // Display a message indicating that the program is exiting.
                    exit = true; // Set the exit variable to true to break the loop and exit the program.
                    break; // End of case 5 block.
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5."); // Display an error message if the user enters an invalid choice.
            }
        }

        scanner.close(); // Close the scanner object to free up resources.
    }

    }