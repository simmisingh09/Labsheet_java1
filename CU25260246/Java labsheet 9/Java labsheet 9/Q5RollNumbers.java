import java.util.TreeSet;
public class Q5RollNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> rollNumbers = new TreeSet<>();

        rollNumbers.add(45);
        rollNumbers.add(12);
        rollNumbers.add(89);
        rollNumbers.add(23);
        rollNumbers.add(56);
        rollNumbers.add(10);
        rollNumbers.add(78);
        rollNumbers.add(34);
        rollNumbers.add(67);
        rollNumbers.add(5);

        System.out.println("Roll Numbers:");
        System.out.println(rollNumbers);
    }
}
