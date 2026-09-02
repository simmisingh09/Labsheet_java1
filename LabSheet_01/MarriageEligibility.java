import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter gender (male/female): ");
        String gender = scanner.next().toLowerCase();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        if (gender.equals("male")) {
            if (age >= 21) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage (must be 21 or older).");
            }
        } else if (gender.equals("female")) {
            if (age >= 18) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage (must be 18 or older).");
            }
        } else {
            System.out.println("Invalid gender entered.");
        }
        
        scanner.close();
    }
}
