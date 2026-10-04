// 21. Palindrome
class Palindrome21 {
    static int countChecks = 0;

    void checkPalindrome(int number) {
        int n = number;
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        countChecks++;

        if (original == reverse)
            System.out.println(number + " is a Palindrome");
        else
            System.out.println(number + " is not a Palindrome");
    }
}

