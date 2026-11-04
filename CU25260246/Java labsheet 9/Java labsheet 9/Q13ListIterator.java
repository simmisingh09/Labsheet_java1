import java.util.ArrayList;
import java.util.ListIterator;
public class Q13ListIterator {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");
        courses.add("JavaScript");

        ListIterator<String> itr = courses.listIterator();

        System.out.println("Forward Traversal:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Backward Traversal:");

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        System.out.println("Next Index: " + itr.nextIndex());
        System.out.println("Previous Index: " + itr.previousIndex());
    }
}
