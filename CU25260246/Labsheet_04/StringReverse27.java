// 27. StringReverse
class StringReverse27 {
    static int totalReversals = 0;

    void reverseString(String text) {
        String input = text;
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        totalReversals++;

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverse);
    }
}
