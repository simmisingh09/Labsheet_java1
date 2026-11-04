import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Q4AppendFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            FileWriter writer = new FileWriter("students.txt", true);

            writer.write("\nStudent Name: " + name);
            writer.write("\nRoll Number: " + roll);
            writer.write("\nMarks: " + marks + "\n");

            writer.close();

            System.out.println("Student record added successfully!");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}