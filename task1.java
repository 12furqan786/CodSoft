package codsoft;
import java.util.Scanner;
import java.util.Random;

public class task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attemptsLimit = 7;
        int roundsLimit = 3;
        int score = 0;

        for (int round = 1; round <= roundsLimit; round++) {
            int generatedNumber = random.nextInt(100) + 1;
            int attempts = 0;

            while (true) {
                System.out.print("Enter your guess between 1 and 100: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess > generatedNumber) {
                    System.out.println("Too high! The number is lower than your guess.");
                } else {
                    System.out.println("Too low! The number is higher than your guess.");
                }

                if (attempts == attemptsLimit) {
                    System.out.println("You have reached the maximum number of attempts.");
                    break;
                }
            }
        }

        System.out.println("Your score is " + score + " out of " + roundsLimit + " rounds.");
    }
}