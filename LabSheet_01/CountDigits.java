import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num < 10) {
            System.out.println("1 digit");
        } else if (num < 100) {
            System.out.println("2 digits");
        } else if (num < 1000) {
            System.out.println("3 digits");
        } else if (num < 10000) {
            System.out.println("4 digits");
        } else {
            System.out.println("5 or more digits");
        }
    }
}
