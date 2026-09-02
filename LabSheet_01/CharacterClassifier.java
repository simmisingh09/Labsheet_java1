
import java.util.Scanner;

public class CharacterClassifier {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        // Read a string from user and extract the first character
        char ch = scanner.next().charAt(0);
        
        // Character classification using if-else structures
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is a special character.");
        }
        
        // Close the scanner resource
        scanner.close();
    }
}
