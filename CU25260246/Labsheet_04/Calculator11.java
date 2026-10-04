// 11. Calculator
class Calculator11 {
    static int operationsCount = 0;

    void add(int a, int b) {
        int x = a, y = b;
        int result = x + y;
        operationsCount++;
        System.out.println("Addition: " + result);
    }

    void subtract(int a, int b) {
        int x = a, y = b;
        int result = x - y;
        operationsCount++;
        System.out.println("Subtraction: " + result);
    }

    void multiply(int a, int b) {
        int x = a, y = b;
        int result = x * y;
        operationsCount++;
        System.out.println("Multiplication: " + result);
    }

    void divide(int a, int b) {
        int x = a, y = b;
        double result = (double) x / y;
        operationsCount++;
        System.out.println("Division: " + result);
    }
}
