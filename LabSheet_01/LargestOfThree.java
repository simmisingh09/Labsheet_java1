



import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Assume the first number is the largest initially
        int largest = num1;

        // Check if the second number is larger than the current largest
        if (num2 > largest) {
            largest = num2;
        }

        // Check if the third number is larger than the current largest
        if (num3 > largest) {
            largest = num3;
        }

        // Print the final largest number
        System.out.println("The largest number is: " + largest);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
