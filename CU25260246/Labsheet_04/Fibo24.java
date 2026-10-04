// 24. Fibonacci
class Fibo24 {
    static int seriesCount = 0;

    void displaySeries(int n) {
        int terms = n;
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        seriesCount++;
    }
}
