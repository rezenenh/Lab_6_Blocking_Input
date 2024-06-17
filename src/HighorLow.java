import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Generate the random number between 1 and 10
        int userGuess = 0;
        boolean validInput;

        // Get a user input
        do {
            validInput = true;
            System.out.print("Guess a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        // Display the random number and show appropriate response to guess
        System.out.println("The random number was: " + randomNumber);
        if (userGuess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Congratulations! Your guess was correct.");
        }
    }
}
