import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Q9StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter writer =
                    new FileWriter("student_records.txt");

            for (int i = 1; i <= 5; i++) {

                System.out.println("\nEnter Details of Student " + i);

                System.out.print("Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Marks: ");
                double marks = sc.nextDouble();
                sc.nextLine();

                writer.write("Roll Number: " + roll + "\n");
                writer.write("Name: " + name + "\n");
                writer.write("Course: " + course + "\n");
                writer.write("Marks: " + marks + "\n");
                writer.write("----------------------\n");
            }
            writer.close();

            System.out.println("\nRecords Saved Successfully!");

            BufferedReader br = new BufferedReader(
                    new FileReader("student_records.txt"));

            String line;

            System.out.println("\nStudent Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
