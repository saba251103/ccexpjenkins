import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();

        int numberToGuess = rand.nextInt(10) + 1;  // 1-10
        int autoGuess = rand.nextInt(10) + 1;      // Jenkins auto guess

        System.out.println("=== NUMBER GUESSING GAME (AUTO MODE) ===");
        System.out.println("Computer picked: " + numberToGuess);
        System.out.println("Jenkins guessed: " + autoGuess);

        if (autoGuess == numberToGuess) {
            System.out.println("✅ Jenkins guessed correctly!");
        } else {
            System.out.println("❌ Jenkins guessed wrong!");
        }
    }
}
