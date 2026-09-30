public class Main {
    public static void main(String[] args) {
        //Skapa ett objekt med Account card = new Account ().
        Account card = new Account();
        
        //Sätt card.owner och card.balance till värdena "Alex" och 350.0.
        card.owner = "Alex";
        card.balance = 350.0;

        //Skriv ut fälten med System.out.println.
        System.out.println(card.owner);
        System.out.println(card.balance);
    }
}