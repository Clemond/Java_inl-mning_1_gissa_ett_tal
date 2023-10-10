import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {

        // Här är ett exempel på hur dialogen mellan användaren och datorn kan se ut.

        // Gissa ett tal mellan 1 och 100.

        // Gissning 1: 50

        // Talet är större.

        // Gissning 2: 75

        // Talet är mindre.

        // Gissning 3: 60

        // Talet är mindre.

        // Gissning 4: Fyra

        // Du kan bara skriva ett tal med siffror. Försök igen!

        // Gissning 4: 55

        // Rätt! Du gissade rätt på 4 försök.

        // Vill du spela igen (Ja/Nej)? Nope

        // Vill du spela igen (Ja/Nej)? Nej

        // Tack för den här gången!


        
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