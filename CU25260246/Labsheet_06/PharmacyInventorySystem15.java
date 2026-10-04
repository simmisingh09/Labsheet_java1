import java.util.Scanner;

// Q15. Pharmacy Inventory System

class PharmacyInventorySystem15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicineName = sc.nextLine();

            System.out.print("Enter available quantity: ");
            String availableString = sc.nextLine();

            System.out.print("Enter required quantity: ");
            String requiredString = sc.nextLine();

            int available =
                Integer.parseInt(availableString);

            int required =
                Integer.parseInt(requiredString);

            // Check negative quantity
            if (available < 0 || required < 0) {

                throw new InvalidQuantityException15(
                    "Quantity cannot be negative."
                );
            }

            // Check available stock
            if (required > available) {

                throw new InsufficientMedicineStockException15(
                    "Required quantity is greater than available stock."
                );
            }

            int remaining = available - required;

            System.out.println(
                "Medicine Name: " + medicineName
            );

            System.out.println(
                "Medicine issued successfully."
            );

            System.out.println(
                "Remaining quantity: " + remaining
            );

        } catch (NumberFormatException e) {

            System.out.println(
                "Error: Enter valid numeric quantities."
            );

        } catch (InvalidQuantityException15 e) {

            System.out.println(
                "Error: " + e.getMessage()
            );

        } catch (InsufficientMedicineStockException15 e) {

            System.out.println(
                "Error: " + e.getMessage()
            );

        } finally {

            System.out.println(
                "Inventory transaction completed."
            );
        }

        sc.close();
    }
}


// Custom Exception 1
class InvalidQuantityException15 extends Exception {

    public InvalidQuantityException15(String message) {
        super(message);
    }
}


// Custom Exception 2
class InsufficientMedicineStockException15
        extends Exception {

    public InsufficientMedicineStockException15(String message) {
        super(message);
    }
}
