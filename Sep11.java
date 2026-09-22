public class Sep11 {
    public static void main(String[] args) {
        
        int age = 35;
        boolean isStudent = false;
        boolean isHorrowMovie = true;

        if (age < 15 && isHorrowMovie) {
            System.out.println("NEKAD: Skräckfilm kräver 15 år");
        }else if (age < 12) {
            System.out.println("Biljettpris: 65 kr");
        }else if (isStudent) {
            System.out.println("Biljettpris: 85 kr");
        }else {
            System.out.println("Biljettpris: 130 kr");
        }
    }
}
