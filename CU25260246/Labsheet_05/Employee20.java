// Q20. University Employee System - Integrated OOP

// -----------------------------
// Researcher Interface
// -----------------------------
interface Researcher20 {

    void conductResearch();
}


// -----------------------------
// Parent Class: Employee
// -----------------------------
class Employee20 {

    private int employeeId;
    private String employeeName;
    private double salary;

    // Setter for employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Salary: " + getSalary());
    }

    // Salary calculation
    public void calculateSalary() {
        System.out.println("Employee Salary: " + getSalary());
    }
}


// -----------------------------
// Teacher extends Employee
// -----------------------------
class Teacher20 extends Employee20
        implements Researcher20 {

    private String subject;

    // Setter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter
    public String getSubject() {
        return subject;
    }

    // Teacher method
    public void teach() {
        System.out.println(
            getEmployeeName() + " is teaching " + getSubject()
        );
    }

    // Researcher interface method
    @Override
    public void conductResearch() {
        System.out.println(
            getEmployeeName() + " is conducting research."
        );
    }

    // Method overriding
    @Override
    public void calculateSalary() {

        double bonus = 10000;

        // super is used to access parent class salary
        double totalSalary = super.getSalary() + bonus;

        System.out.println(
            "Teacher Salary with Bonus: " + totalSalary
        );
    }
}


// -----------------------------
// VisitingTeacher extends Teacher
// -----------------------------
class VisitingTeacher20 extends Teacher20 {

    private int hoursWorked;

    // Setter
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Getter
    public int getHoursWorked() {
        return hoursWorked;
    }

    // Override calculateSalary()
    @Override
    public void calculateSalary() {

        double hourlyRate = 500;
        double totalSalary = getHoursWorked() * hourlyRate;

        System.out.println(
            "Visiting Teacher Salary: " + totalSalary
        );
    }
}


// -----------------------------
// Admin extends Employee
// -----------------------------
class Admin20 extends Employee20 {

    private String department;

    // Setter
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter
    public String getDepartment() {
        return department;
    }

    // Admin-specific method
    public void manageDepartment() {
        System.out.println(
            getEmployeeName()
            + " manages the "
            + getDepartment()
            + " department."
        );
    }

    // Override calculateSalary()
    @Override
    public void calculateSalary() {

        double allowance = 5000;
        double totalSalary = super.getSalary() + allowance;

        System.out.println(
            "Admin Salary with Allowance: " + totalSalary
        );
    }
}


// -----------------------------
// Main Class
// -----------------------------
class UniversitySystem20 {

    public static void main(String[] args) {

        // -------------------------
        // Teacher Object
        // -------------------------
        Teacher20 teacher = new Teacher20();

        teacher.setEmployeeId(101);
        teacher.setEmployeeName("Dr. Sharma");
        teacher.setSalary(60000);
        teacher.setSubject("Java");

        System.out.println("===== TEACHER DETAILS =====");

        teacher.displayDetails();
        System.out.println("Subject: " + teacher.getSubject());

        teacher.teach();
        teacher.conductResearch();
        teacher.calculateSalary();


        // -------------------------
        // Visiting Teacher Object
        // -------------------------
        VisitingTeacher20 visitingTeacher =
                new VisitingTeacher20();

        visitingTeacher.setEmployeeId(102);
        visitingTeacher.setEmployeeName("Mr. Amit");
        visitingTeacher.setSalary(0);
        visitingTeacher.setSubject("Programming");
        visitingTeacher.setHoursWorked(20);

        System.out.println();
        System.out.println("===== VISITING TEACHER DETAILS =====");

        visitingTeacher.displayDetails();
        System.out.println(
            "Subject: " + visitingTeacher.getSubject()
        );
        System.out.println(
            "Hours Worked: " + visitingTeacher.getHoursWorked()
        );

        visitingTeacher.teach();
        visitingTeacher.conductResearch();
        visitingTeacher.calculateSalary();


        // -------------------------
        // Admin Object
        // -------------------------
        Admin20 admin = new Admin20();

        admin.setEmployeeId(103);
        admin.setEmployeeName("Mr. Raj");
        admin.setSalary(50000);
        admin.setDepartment("Administration");

        System.out.println();
        System.out.println("===== ADMIN DETAILS =====");

        admin.displayDetails();
        System.out.println(
            "Department: " + admin.getDepartment()
        );

        admin.manageDepartment();
        admin.calculateSalary();
    }
}
