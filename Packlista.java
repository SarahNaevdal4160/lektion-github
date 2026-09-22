

public class Packlista {      
    public static void main(String[] args) {  
    int[]packVikt = new int[5];
    packVikt[0] = 800;
    packVikt[1] = 1200;
    packVikt[2] = 450;
    packVikt[3] = 300;
    packVikt[4] = 950;

    int totalGram = 0;

    for (int i = 0; i < packVikt.length; i++) {
        System.out.println("Packning " + (i + 1) + ": " + packVikt[i] + " gram");
        //System.out.println(packVikt[5]);
        //Felkod: ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //Index 5 finns inte i arrayen PackVikt eftersom den har 5 element med index 0-4.
        totalGram = totalGram + packVikt[i];
    }
    System.out.println("Total vikt: " + totalGram + " gram");
    }
}
