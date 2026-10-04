// 7. BankAccount
class BankAccount7 {
    long accountNumber;
    double balance;
    static String bankName = "SBI";

    void deposit(double amount) {
        double depositAmount = amount;
        balance = balance + depositAmount;
        System.out.println("Deposited: " + depositAmount);
        System.out.println("Balance: " + balance);
    }
}
