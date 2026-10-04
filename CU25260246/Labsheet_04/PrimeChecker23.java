// 23. PrimeChecker
class PrimeChecker23 {
    static int totalPrimeChecks = 0;

    void checkPrime(int number) {
        int n = number;
        boolean prime = true;

        if (n <= 1)
            prime = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        totalPrimeChecks++;

        if (prime)
            System.out.println(number + " is Prime");
        else
            System.out.println(number + " is not Prime");
    }
}
