import java.util.Scanner;

public class TypeCastDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        float originalFloat = sc.nextFloat();

        int convertedInt = (int) originalFloat;

        System.out.println("Original float value: " + originalFloat);
        System.out.println("Converted int value: " + convertedInt);
    }
}
