// Q2. Bank Account with Validation
class BankAccount2 {
    private long accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public static void main(String[] args) {
        BankAccount2 b = new BankAccount2();

        b.setAccountNumber(123456);
        b.setAccountHolder("Amit");
        b.setBalance(5000);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Balance: " + b.getBalance());

        b.deposit(2000);
        b.withdraw(1000);
        b.withdraw(10000);

        System.out.println("Final Balance: " + b.getBalance());
    }
}
