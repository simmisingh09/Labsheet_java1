import java.util.ArrayList;
import java.util.Scanner;
class Student<T, U, V> {
    T id;
    U name;
    V marks;
    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}
public class Q15StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student<Integer, String, Double>> list =
            new ArrayList<>();
        list.add(new Student<>(101, "Rahul", 85.5));
        list.add(new Student<>(102, "Priya", 90.0));
        list.add(new Student<>(103, "Amit", 78.5));
        list.add(new Student<>(104, "Neha", 88.0));
        list.add(new Student<>(105, "Rohan", 92.5));
        System.out.println("All Student Details:");
        for (Student<Integer, String, Double> s : list) {
            s.display();
        }
        System.out.print("Enter Student ID to search: ");
        int searchId = sc.nextInt();
        boolean found = false;
        for (Student<Integer, String, Double> s : list) {
            if (s.id.equals(searchId)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
        System.out.println("Total Students: " + list.size());
        sc.close();
    }
}