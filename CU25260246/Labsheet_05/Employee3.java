// Q3. Employee Salary Encapsulation
class Employee3 {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        if (salary < 0 || salary > 1000000) {
            System.out.println("Invalid salary: " + salary);
            return;
        }

        this.salary = salary;
        System.out.println("Salary set successfully.");
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Employee3 e = new Employee3();

        e.setEmployeeId(101);
        e.setEmployeeName("Rahul");

        e.setSalary(50000);       // Valid
        e.setSalary(-10000);     // Invalid

        e.displayDetails();
    }
}
