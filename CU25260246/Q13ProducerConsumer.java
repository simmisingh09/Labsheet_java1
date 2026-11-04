class Buffer {
    int number;
    boolean available = false;

    synchronized void produce(int num) {
        try {
            while (available) {
                wait();
            }
            number = num;
            System.out.println("Produced: " + number);
            available = true;
            notify();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    synchronized void consume() {
        try {
            while (!available) {
                wait();
            }
            System.out.println("Consumed: " + number);
            available = false;
            notify();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class Producer extends Thread {
    Buffer b;
    Producer(Buffer b) {
        this.b = b;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            b.produce(i);
        }
    }
}
class Consumer extends Thread {
    Buffer b;
    Consumer(Buffer b) {
        this.b = b;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            b.consume();
        }
    }
}

public class Q13ProducerConsumer {
    public static void main(String[] args) {

        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}