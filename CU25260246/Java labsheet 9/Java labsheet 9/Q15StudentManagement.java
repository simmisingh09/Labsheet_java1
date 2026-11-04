import java.util.*;
public class Q15StudentManagement {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        HashSet<Integer> uniqueIDs = new HashSet<>();
        TreeSet<Integer> sortedIDs = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Forward Traversal");
            System.out.println("7. Backward Traversal");
            System.out.println("8. Display Sorted IDs");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (uniqueIDs.contains(id)) {
                        System.out.println("Student ID already exists!");
                    } else {
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        students.add(id + " - " + name);
                        uniqueIDs.add(id);
                        sortedIDs.add(id);

                        System.out.println("Student Added Successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    int removeID = sc.nextInt();

                    if (uniqueIDs.remove(removeID)) {

                        sortedIDs.remove(removeID);

                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).startsWith(removeID + " - ")) {
                                students.remove(i);
                                break;
                            }
                        }

                        System.out.println("Student Removed!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchID = sc.nextInt();

                    boolean found = false;

                    for (String student : students) {
                        if (student.startsWith(searchID + " - ")) {
                            System.out.println("Student Found: " + student);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Student Records:");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;

                case 5:
                    System.out.println("Total Students: " + students.size());
                    break;

                case 6:
                    System.out.println("Forward Traversal:");

                    ListIterator<String> itr =
                            students.listIterator();

                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;

                case 7:
                    System.out.println("Backward Traversal:");

                    ListIterator<String> itr2 =
                            students.listIterator(students.size());

                    while (itr2.hasPrevious()) {
                        System.out.println(itr2.previous());
                    }
                    break;

                case 8:
                    System.out.println("Unique IDs: " + uniqueIDs);
                    System.out.println("Sorted IDs: " + sortedIDs);
                    break;

                case 9:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}
