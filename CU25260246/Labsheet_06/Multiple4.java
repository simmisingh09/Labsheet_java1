import java.util.Scanner;

// Q4. Multiple Catch Blocks
class Multiple4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String first = sc.next();

            System.out.print("Enter second number: ");
            String second = sc.next();

            int a = Integer.parseInt(first);
            int b = Integer.parseInt(second);

            int result = a / b;

            System.out.println("Division = " + result);

            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Element = " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }

        sc.close();
    }
}
