    public class Main {
    public static void main(String[] args) {
        //Återanvänd Account-klass från uppgift 1, inga nya fält.
        //Skapa två objekt, ticketMira och ticketNoel, i main med var sitt new Account().
        
        Account ticketMira = new Account();
        Account ticketNoel = new Account();
        
        //Sätt Mira: owner = "Mira", balance = 420.0 och Noel: owner = "Noel", balance = 90.0.

        ticketMira.owner = "Mira";
        //ticketMira.balance = 420.0;
        //Ändra Miras balance till 380.0 istället för 420.0.
        ticketMira.balance = 380.0;

        ticketNoel.owner = "Noel";
        ticketNoel.balance = 90.0;

        //Skriv ut båda objektens fält.
        System.out.println(ticketMira.owner + ": " + ticketMira.balance);
        System.out.println(ticketNoel.owner + ": " + ticketNoel.balance);

        //Gör en medveten "fel-utskrift": System.out.println(ticketMira).
        //Notera vad som syns. Skriv en mening i Docs: varför det inte är namnet Mira. 
        System.out.println(ticketMira);
        //Det som skrivs ut i konsolen är Account@6b95977.

    }
}