// 20. BankAccount
class BankAccount20 {
    double balance;
    static String bankCode = "BANK001";

    void withdraw(double amount) {
        double withdrawalAmount = amount;
        double currentBalance = balance;

        if (withdrawalAmount <= currentBalance) {
            balance = currentBalance - withdrawalAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Withdrawal Failed");
            System.out.println("Insufficient Balance");
        }

        System.out.println("Bank Code: " + bankCode);
    }
}
