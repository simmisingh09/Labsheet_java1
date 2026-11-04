import java.util.LinkedList;
public class Q8StudentQueue {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("Aman");
        students.addLast("Rahul");
        students.addLast("Priya");
        students.addFirst("Neha");

        System.out.println("Student Queue: " + students);

        students.removeFirst();
        System.out.println("After Removing First: " + students);

        students.removeLast();
        System.out.println("After Removing Last: " + students);
    }
}
