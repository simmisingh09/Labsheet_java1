import java.util.ArrayList;
public class Q14GenericArrayList {
    static <T> void display(ArrayList<T> list) {
        for (T value : list) {
            System.out.println(value);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");

        System.out.println("Integer List:");
        display(numbers);

        System.out.println("String List:");
        display(names);
    }
}