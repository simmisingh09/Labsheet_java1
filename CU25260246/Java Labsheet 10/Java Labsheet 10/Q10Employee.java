import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Q10Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("employees.txt", true);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            writer.write(id + "," + name + "," +
                    department + "," + salary + "\n");

            writer.close();

            System.out.println("Employee Record Saved!");

            System.out.print("Enter Employee ID to Search: ");
            int searchID = sc.nextInt();

            File file = new File("employees.txt");

            if (file.exists()) {

                BufferedReader br = new BufferedReader(
                        new FileReader(file));

                String line;
                boolean found = false;

                while ((line = br.readLine()) != null) {

                    String[] data = line.split(",", 4);

                    if (data.length == 4 &&
                        data[0].equals(String.valueOf(searchID))) {

                        System.out.println("\nEmployee Found!");
                        System.out.println("Employee ID: " + data[0]);
                        System.out.println("Employee Name: " + data[1]);
                        System.out.println("Department: " + data[2]);
                        System.out.println("Salary: " + data[3]);

                        found = true;
                        break;
                    }
                }
                br.close();

                if (!found) {
                    System.out.println("Employee record not found.");
                }
            } else {
                System.out.println("Employee file does not exist!");
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
