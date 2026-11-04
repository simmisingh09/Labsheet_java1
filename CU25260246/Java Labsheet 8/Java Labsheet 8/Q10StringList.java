import java.util.ArrayList;
public class Q10StringList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Neha");
        names.add("Rohan");

        System.out.println("Original List: " + names);

        System.out.println("Get Element: " + names.get(1));

        names.set(1, "Karan");
        System.out.println("After Set: " + names);

        names.remove("Priya");
        System.out.println("After Remove: " + names);

        System.out.println("List Size: " + names.size());
    }
}