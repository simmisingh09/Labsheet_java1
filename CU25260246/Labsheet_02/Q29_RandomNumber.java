import java.util.Random;

public class Q29_RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int num = random.nextInt(100) + 1;

            System.out.println("Generated number: " + num);

            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("Found: " + num);
                break;
            }
        }
    }
}
