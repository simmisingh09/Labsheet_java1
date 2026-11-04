import java.util.ArrayList;
import java.util.LinkedList;
public class Q14ArrayVsLinkedList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        list.add("Aman");
        list.add("Rahul");
        list.add("Priya");

        linkedList.add("Aman");
        linkedList.add("Rahul");
        linkedList.add("Priya");

        list.add(1, "Neha");
        linkedList.add(1, "Neha");

        list.remove("Rahul");
        linkedList.remove("Rahul");

        System.out.println("ArrayList Element: " + list.get(1));
        System.out.println("LinkedList Element: " + linkedList.get(1));

        System.out.println("ArrayList Size: " + list.size());
        System.out.println("LinkedList Size: " + linkedList.size());

        System.out.println("ArrayList Elements:");
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("LinkedList Elements:");
        for (String name : linkedList) {
            System.out.println(name);
        }
    }
}
