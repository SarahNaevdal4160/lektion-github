public class Uppgift1 {
    public static void main(String[] args) {
        
        int accountBalance = 500;
        int menuChoice = 1;
        int simulationStep = 1;
        while (menuChoice != 0) {
            if(menuChoice == 1) {
                System.out.println("ditt saldo är = "+ accountBalance);
            }
            
            else if(menuChoice == 2) {
                accountBalance -= 100;
                System.out.println("tog ut 100 kronor. nytt saldo är = "+ accountBalance);
            }
            
            else if(menuChoice == 3) {
                int forecastBalance = accountBalance;
                for (int year = 1; year <= 5; year++)
                {
                    int earnedInterest = forecastBalance *5/100; 
                    forecastBalance += earnedInterest; 
                    
                    System.out.println("år "+ year + " ränta är: "+ earnedInterest + " och beloppet är :"+ forecastBalance);
                }
            }
            
            else {
                System.out.println("ogiltigt val");
            }
            
            if (simulationStep == 1) {
                menuChoice =1;
            }
            
            else if (simulationStep == 2) {
                menuChoice = 2;
            }
            
            else if(simulationStep == 3) {
                menuChoice = 3;
            }
            else if(simulationStep == 4) {
                menuChoice = 0;
                System.out.println("hejdå");
            }
                
                
            
            simulationStep++;
        }
    }
}
    }
}

}