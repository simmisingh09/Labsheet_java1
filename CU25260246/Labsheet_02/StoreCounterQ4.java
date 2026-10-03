import java.util.Scanner;

public class StoreCounterQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visitors = 0;

        System.out.println("Visitors entering the store:");

        System.out.println("Visitor count: " + (++visitors)); // Prefix
        System.out.println("Visitor count: " + (visitors++)); // Postfix
        System.out.println("Visitor count: " + visitors);

        System.out.println("\nVisitors leaving the store:");

        System.out.println("Visitor count: " + (visitors--)); // Postfix
        System.out.println("Visitor count: " + (--visitors)); // Prefix

        sc.close();
    }
}
