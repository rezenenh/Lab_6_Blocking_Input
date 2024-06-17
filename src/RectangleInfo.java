import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double length = 0;
        boolean validInput;

        // Get the width of the rectangle
        do {
            validInput = true;
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width <= 0) {
                    System.out.println("Invalid input. Please enter a positive number.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Get the length of the rectangle
        do {
            validInput = true;
            System.out.print("Enter the length of the rectangle: ");
            if (scanner.hasNextDouble()) {
                length = scanner.nextDouble();
                if (length <= 0) {
                    System.out.println("Invalid input. Please enter a positive number.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Calculate the area, perimeter, and diagonal of the rectangle
        double area = width * length;
        double perimeter = 2 * (width + length);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));

        // Print the results
        System.out.printf("The area of the rectangle is: %.2f\n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f\n", perimeter);
        System.out.printf("The length of the diagonal of the rectangle is: %.2f\n", diagonal);
    }
}
