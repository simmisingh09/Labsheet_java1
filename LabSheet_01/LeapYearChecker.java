import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Logical check for leap year
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        // Close the scanner to release resources
        scanner.close();
    }
}
