// 18. ElectricBill
class ElectricBill18 {
    int units;
    static double fixedCharge = 100;

    void calculateBill() {
        int u = units;
        double bill;

        if (u <= 100)
            bill = u * 5;
        else if (u <= 200)
            bill = 100 * 5 + (u - 100) * 7;
        else
            bill = 100 * 5 + 100 * 7 + (u - 200) * 10;

        double totalBill = bill + fixedCharge;

        System.out.println("Units: " + u);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Total Bill: " + totalBill);
    }
}
