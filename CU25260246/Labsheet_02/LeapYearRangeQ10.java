import java.util.Scanner;

public class LeapYearRangeQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter range start: ");
        int start = sc.nextInt();

        System.out.print("Enter range end: ");
        int end = sc.nextInt();

        boolean leapYear = (year % 400 == 0) ||
                           (year % 4 == 0 && year % 100 != 0);

        if (leapYear && year >= start && year <= end) {
            System.out.println(year + " is a leap year and is within the range.");
        } else {
            System.out.println(year + " does not satisfy both conditions.");
        }

        sc.close();
    }
}
