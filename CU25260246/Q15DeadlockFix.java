public class Q15DeadlockFix {
    public static void main(String[] args) {
        final Object Lock1 = new Object();
        final Object Lock2 = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1 locked Lock1");
                synchronized (Lock2) {
                    System.out.println("Thread 1 locked Lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 2 locked Lock1");
                synchronized (Lock2) {
                    System.out.println("Thread 2 locked Lock2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}