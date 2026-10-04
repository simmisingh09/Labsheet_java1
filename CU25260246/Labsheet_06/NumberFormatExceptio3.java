// Q3. Handling NumberFormatException
class NumberFormatExceptio3 {
    public static void main(String[] args) {

        String number = "123";

        try {
            int value = Integer.parseInt(number);

            System.out.println("Integer value = " + value);

        } catch (NumberFormatException e) {
            System.out.println("Invalid integer format.");
        }
    }
}
