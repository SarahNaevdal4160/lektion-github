import java.util.List;
import java.util.ArrayList;

public class Spellista {

    
    public static void main(String[] args) {
        List<String> spellista = new ArrayList<>();
        //List är en interface, ArrayList är en klass som implementerar List.
        //List är som ett körkort, ArrayList är som en bil. Man kan ha flera olika bilar (ArrayList, LinkedList, etc.) som alla kan köra med samma körkort (List).
        spellista.add("Don't Stop The Music");
        spellista.add("Only Girl (In The World)");
        spellista.add("We Found Love");     
        spellista.add("Diamonds");
        spellista.add("Where Have You Been");
        
        for (int i = 0; i < spellista.size(); i++) {
            System.out.println("Låt " + (i + 1) + ": " + spellista.get(i));
            //Parenteser på size eftersom det är en metod som anropas, metoder kräver alltid parenteser.
            //length används för arrayer, size() används för listor.
            
            //i + 1 visar 1, 2, 3, 4, 5 för användaren istället för 0, 1, 2, 3, 4 som är index i listan.
            
            //[] används för arrayer, get() används för listor.
        }
        System.out.println("Totalt antal låtar: " + spellista.size());
    }
}

