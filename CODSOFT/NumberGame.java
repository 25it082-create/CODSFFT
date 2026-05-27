import java.util.Scanner;
import java.util.Random;

  public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 7;
        int roundsWon = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {

            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean wonRound = false;

            System.out.println("\n--- New Round ---");
            System.out.println("Thinking of a number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");


                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    scanner.next();
                    continue;
                }

                int userGuess = scanner.nextInt();
                attempts++;


                if (userGuess == targetNumber) {
                    System.out.println("Correct! You got it in " + attempts + " attempts.");
                    wonRound = true;
                    roundsWon++;
                    break;
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }

                System.out.println("Remaining attempts: " + (maxAttempts - attempts));
            }

            if (!wonRound) {
                System.out.println("\nOut of attempts! The number was: " + targetNumber);
            }


            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();

            if (!response.startsWith("y")) {
                playAgain = false;
            }
        }

        System.out.println("\n GAME OVER ");
        System.out.println("Total rounds won: " + roundsWon);
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
