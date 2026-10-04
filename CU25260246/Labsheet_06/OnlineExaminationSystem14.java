import java.util.Scanner;

// Q14. Online Examination System

class OnlineExaminationSystem14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks: ");
            String marksString = sc.nextLine();

            int marks = Integer.parseInt(marksString);

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException14(
                    "Marks must be between 0 and 100."
                );
            }

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

        } catch (NumberFormatException e) {

            System.out.println(
                "Error: Please enter a valid number."
            );

        } catch (InvalidExamMarksException14 e) {

            System.out.println(
                "Error: " + e.getMessage()
            );

        } finally {

            System.out.println(
                "Exam evaluation completed."
            );
        }

        sc.close();
    }
}


// Custom Exception
class InvalidExamMarksException14 extends Exception {

    public InvalidExamMarksException14(String message) {
        super(message);
    }
}
