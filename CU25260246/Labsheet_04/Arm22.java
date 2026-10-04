// 22. Armstrong
class Arm22 {
    static int totalChecks = 0;

    void checkArmstrong(int number) {
        int n = number;
        int original = n;
        int sum = 0;
        int digits = 0;

        while (n > 0) {
            digits++;
            n = n / 10;
        }

        n = number;

        while (n > 0) {
            int digit = n % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++)
                power = power * digit;

            sum = sum + power;
            n = n / 10;
        }

        totalChecks++;

        if (sum == original)
            System.out.println(number + " is an Armstrong Number");
        else
            System.out.println(number + " is not an Armstrong Number");
    }
}
