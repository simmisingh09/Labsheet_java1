class BankAccount {
    int balance = 10000;
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
    }
}

class MyThread extends Thread {
    BankAccount account;
    MyThread(BankAccount account) {
        this.account = account;
    }
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }
}

public class Q11Synchronized {
    public static void main(String[] args) {        
        BankAccount account = new BankAccount();
        MyThread t1 = new MyThread(account);
        MyThread t2 = new MyThread(account);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Balance: " + account.balance);
    }
}