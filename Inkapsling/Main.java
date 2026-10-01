public class Main {
    public static void main(String[] args) {
        //Skapa Account nora = new Account("Nora"' 300.0).
        Account nora = new Account("Nora", 300.0); 
        //Skriv medvetet System.out.println(nora.balance); för att testa felmeddelandet.
        //System.out.println(nora.balance); //The field Account.balance is not visible. 
        System.out.println(nora.getBalance());
    }
}
