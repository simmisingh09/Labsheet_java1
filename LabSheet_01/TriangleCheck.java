import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles: ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        if (a1 + a2 + a3 == 180 && a1 > 0 && a2 > 0 && a3 > 0) {
            System.out.println("Valid triangle.");
        } else {
            System.out.println("Not a valid triangle.");
        }
    }
}
