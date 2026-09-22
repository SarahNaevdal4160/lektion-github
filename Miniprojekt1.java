import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Miniprojekt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> history = new ArrayList<>();
        
        int balance = 1000;
        int choice = -1;
        
        showWelcome(); 
    
        while (choice != 0) {
            showMenu();
            System.out.print("Ditt val: ");
            choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Ditt saldo är: " + balance + " kr");
        } else if (choice == 2) {
            balance += 500;
            history.add(500);
            System.out.println("Nytt saldo är: " + balance + " kr");
        } else if (choice == 3) {
            int interest = calculateInterest(balance, 5);
            System.out.println("Årlig ränta: " + interest + " kr");
        } else if (choice == 4) { 
            System.out.println("Historik av transaktioner:");
            if (history.size() == 0) {
                System.out.println("Ingen historik tillgänglig.");
            }
            for (int i = 0; i < history.size(); i++) {
                System.out.println("Insättning " +(i + 1) + ": " + history.get(i) + " kr");
            }
        } else if (choice == 0) {
            System.out.println("Kortet matas ut. Hejdå!");
        } else {
            System.out.println("Ogiltigt val. Försök igen.");
        }
    }
}

    public static int calculateInterest(int amount, int rate) {
        return amount * rate / 100;
    }
    public static void showWelcome() {
        System.out.println("Välkommen till bankomaten!");
    }

    public static void showMenu() {
        System.out.println("1. Se saldo | 2. Sätt in 500 | 3. Ränta | 4. Historik | 0. Avsluta");
    }
}
