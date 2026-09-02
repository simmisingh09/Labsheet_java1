import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer (0 or 1): ");
        int a = sc.nextInt();
        System.out.print("Enter second integer (0 or 1): ");
        int b = sc.nextInt();
        System.out.print("Enter logical operator (&, |, ^): ");
        char op = sc.next().charAt(0);

        boolean b1 = (a != 0);
        boolean b2 = (b != 0);
        boolean result = false;
        boolean valid = true;

        if (op == '&') {
            result = b1 && b2;
        } else if (op == '|') {
            result = b1 || b2;
        } else if (op == '^') {
            result = b1 ^ b2;
        } else {
            valid = false;
            System.out.println("Invalid operator.");
        }

        if (valid) {
            System.out.println("Result: " + (result ? 1 : 0));
        }
    }
}
