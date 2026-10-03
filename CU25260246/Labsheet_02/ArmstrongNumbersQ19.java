public class ArmstrongNumbersQ19 {
    public static void main(String[] args) {

        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int num = 1; num <= 1000; num++) {
            int temp = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
