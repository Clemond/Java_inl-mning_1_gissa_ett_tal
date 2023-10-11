import java.util.Random;
import java.util.Scanner;

public class Game {
    
    public void Game(){
        boolean playAgain = true;

        System.out.println("Hej och välkommen till spelet 'gissa ett tal'");
        while(playAgain){
            System.out.println("Vänligen gissa på ett tal mellan 1 och 100: ");
            //Skapa ett random objekt, Generera fram ett random tal mellan 1 och 100
            Random randomNumber = new Random();
            int rightAnswere = randomNumber.nextInt(100);

            boolean gameOn = true;
            int försök = 0;

            while(gameOn){
                försök++;
                try {
                    System.out.println("Gissning " + försök + ":");
                    Scanner myScanner = new Scanner(System.in);
                    int userGuess = myScanner.nextInt();
            
                    if(userGuess > rightAnswere){
                    System.out.println("Talet är mindre");
                    }
                    else if(userGuess < rightAnswere){
                    System.out.println("Talet är större");
                    }
                    else{
                    System.out.println("Rätt! du gissade rätt på " + försök + " antal försök");
                    gameOn = false;
                    }
                } catch (Exception e) {
                    System.out.println("OBS Du kan bara skriva in ett tal med siffror! Försök igen!");
                    försök--;
                }
            }
            System.out.println("Vill du spela igen? (Ja/Nej)");
            while(true){
             Scanner myScanner = new Scanner(System.in);
             String keepPlaying = myScanner.nextLine();

                if(keepPlaying.equalsIgnoreCase("ja")){
                    gameOn = true;
                    break;
                }
                else if(keepPlaying.equalsIgnoreCase("nej")){
                    playAgain = false;
                    break;
                }
                else{
                System.out.println("Du måste svara ja eller nej!");
                }
            }
        }
        System.out.println("Tack för att du spelade!");
    }
}
