import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonsInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        boolean validInput;

        // Get a valid number of gallons of gas in the tank
        do {
            validInput = true;
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallonsInTank = scanner.nextDouble();
                if (gallonsInTank <= 0) {
                    System.out.println("Invalid input. Please enter a positive number.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Enter the fuel efficiency in mpg
        do {
            validInput = true;
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                if (fuelEfficiency <= 0) {
                    System.out.println("Invalid input. Please enter a positive number.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Input the price of gas per gallon
        do {
            validInput = true;
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon <= 0) {
                    System.out.println("Invalid input. Please enter a positive number.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Calculate the cost per 100 miles and the distance the car can travel with the gas in the tank
        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double distanceWithGas = gallonsInTank * fuelEfficiency;

        // Print the results
        System.out.printf("The cost per 100 miles is: $%.2f\n", costPer100Miles);
        System.out.printf("The car can travel %.2f miles with the gas in the tank.\n", distanceWithGas);
    }
}
