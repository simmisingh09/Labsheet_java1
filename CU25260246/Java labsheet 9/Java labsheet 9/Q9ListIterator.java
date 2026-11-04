import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Q9ListIterator {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Aman");
        students.add("Rahul");
        students.add("Priya");
        ListIterator<String> itr = students.listIterator();

        while (itr.hasNext()) {

            String name = itr.next();
            if (name.equals("Rahul")) {
                itr.set("Karan");
                itr.add("Neha");
            }
        }
        System.out.println("Updated List: " + students);
    }
}
