import java.util.Scanner;

// Q12. Hospital Patient Age Validation

class InvalidPatientAgeException12 extends Exception {

    InvalidPatientAgeException12(String message) {
        super(message);
    }
}

class HospitalPatientAgeValidation12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            String ageInput = sc.nextLine();

            int age = Integer.parseInt(ageInput);

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException12(
                    "Age must be between 0 and 120."
                );
            }

            System.out.println("Patient name = " + name);
            System.out.println("Patient age = " + age);
            System.out.println("Registration successful.");

        } catch (NumberFormatException e) {

            System.out.println("Age must be a number.");

        } catch (InvalidPatientAgeException12 e) {

            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
