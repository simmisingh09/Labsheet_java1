import java.util.Scanner;

// Q13. Pharmaceutical Drug Dosage Validation

class DrugDosageValidation13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String patientName = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drugName = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            String dosageString = sc.nextLine();

            double dosage = Double.parseDouble(dosageString);

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException13(
                    "Dosage must be between 1 mg and 1000 mg."
                );
            }

            System.out.println("Patient Name: " + patientName);
            System.out.println("Drug Name: " + drugName);
            System.out.println("Dosage: " + dosage + " mg");
            System.out.println("Dosage is valid.");

        } catch (NumberFormatException e) {

            System.out.println("Error: Invalid numeric input.");

        } catch (InvalidDosageException13 e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println(
                "Dosage validation completed."
            );
        }

        sc.close();
    }
}


// Custom Exception
class InvalidDosageException13 extends Exception {

    public InvalidDosageException13(String message) {
        super(message);
    }
}
