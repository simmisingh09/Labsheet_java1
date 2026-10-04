import java.util.Scanner;

// Q11. Bank Withdrawal System

class BankWithdrawalSystem11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            String balanceString = sc.nextLine();

            System.out.print("Enter withdrawal amount: ");
            String amountString = sc.nextLine();

            double balance = Double.parseDouble(balanceString);
            double amount = Double.parseDouble(amountString);

            if (amount < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException11(
                        "Insufficient balance.");
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (NumberFormatException e) {

            System.out.println("Invalid numeric input.");

        } catch (InsufficientBalanceException11 e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Bank transaction completed.");
        }

        sc.close();
    }
}

// Custom Exception
class InsufficientBalanceException11 extends Exception {

    public InsufficientBalanceException11(String message) {
        super(message);
    }
}
