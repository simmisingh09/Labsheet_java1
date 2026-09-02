import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int celsius = sc.nextInt();

        // Using type casting to ensure accurate floating-point division
        double fahrenheit = ((double) celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
