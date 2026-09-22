import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inkopslista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> produkter = new ArrayList<>();
        
       for (int r = 0; r < 2; r++) {
            System.out.print("Produkt:");
            String namn = scanner.nextLine();
            System.out.print("Antal:");
            int antal = scanner.nextInt();
            scanner.nextLine(); 
            //Tar jag bort raden scanner.nextLine(); kan jag bara lägga till en produkt i listan istället för två

            produkter.add(namn);
            //Endast namnet på produkten skrivs ut i listan eftersom listan är av typen String. 
            System.out.println("Du har lagt till " + antal + " " + namn + " i inköpslistan.");
        }

        for (int i = 0; i < produkter.size(); i++) {
            String produkt = produkter.get(i);
            System.out.println("Produkt " + (i + 1) + ": " + produkt);
            //Två looper för att skriva ut alla produkter i listan. 
            //Den första loopen lägger till produkterna i listan och den andra loopen skriver ut dem. 
            //Om listan skulle skrivits ut i den första loopen skulle istan skrivas ut direkt efter första produkten och igen efter andra produkten. 
        }
        
        System.out.println("\nAntal varor i inköpslistan: " + produkter.size());

    }
        
        
    }

