import java.util.Scanner;

// Q10. User-Defined Exception

class InvalidMarksException10 extends Exception {

    InvalidMarksException10(String message) {
        super(message);
    }
}

class UserDefinedException10 {

    static void checkMarks(int marks)
            throws InvalidMarksException10 {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException10(
                "Marks must be between 0 and 100."
            );
        }

        System.out.println("Valid marks = " + marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            checkMarks(marks);

        } catch (InvalidMarksException10 e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
