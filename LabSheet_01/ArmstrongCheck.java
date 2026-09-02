import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        
        // Store the original number in a temporary variable to compare later
        int originalNumber = number;
        int sum = 0;
        
        // 1. Extract the last digit, cube it, and add to sum
        int digit1 = number % 10;
        sum = sum + (digit1 * digit1 * digit1);
        number = number / 10; // Remove the last digit
        
        // 2. Extract the second digit, cube it, and add to sum
        int digit2 = number % 10;
        sum = sum + (digit2 * digit2 * digit2);
        number = number / 10; // Remove the second digit
        
        // 3. The remaining number is the first digit
        int digit3 = number;
        sum = sum + (digit3 * digit3 * digit3);
        
        // Check whether the calculated sum matches the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
