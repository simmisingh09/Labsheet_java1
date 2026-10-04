// Q14. Employee Salary Calculation
class Emp_14 {
    double salary = 50000;

    void calculateSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager14 extends Emp_14 {
    @Override
    void calculateSalary() {
        double bonus = 20000;
        double totalSalary = salary + bonus;

        System.out.println("Manager Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        Emp_14 e = new Emp_14();
        Manager14 m = new Manager14();

        e.calculateSalary();
        m.calculateSalary();
    }
}
