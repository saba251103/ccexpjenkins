import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(10) + 1;   // random number between 1–10
        int userGuess = 0;

        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("I have picked a number between 1 and 10.");
        System.out.print("Try to guess it: ");

        userGuess = sc.nextInt();

        if (userGuess == numberToGuess) {
            System.out.println("🎉 Correct! You guessed the number!");
        } else {
            System.out.println("❌ Wrong! The number was: " + numberToGuess);
        }

        sc.close();
    }
}
