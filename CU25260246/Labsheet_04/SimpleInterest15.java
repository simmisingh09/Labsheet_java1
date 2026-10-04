// 15. SimpleInterest
class SimpleInterest15 {
    double principal, rate, time;
    static String bank = "ABC Bank";

    void calculateInterest() {
        double p = principal;
        double r = rate;
        double t = time;

        double interest = (p * r * t) / 100;

        System.out.println("Bank: " + bank);
        System.out.println("Simple Interest: " + interest);
    }
}

