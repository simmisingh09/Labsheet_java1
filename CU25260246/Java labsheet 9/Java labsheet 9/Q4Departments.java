import java.util.HashSet;
public class Q4Departments {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();
        departments.add("Computer Science");
        departments.add("IT");
        departments.add("Management");
        departments.add("Computer Science");
        departments.add("IT");
        departments.add("Mechanical");
        System.out.println("Departments:");
        for (String dept : departments) {
            System.out.println(dept);
        }
    }
}
