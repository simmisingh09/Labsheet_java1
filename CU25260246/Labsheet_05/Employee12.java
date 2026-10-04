// Q12. Employee -> Developer and Manager
class Employee12 {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer12 extends Employee12 {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Developer writes code in "
                + programmingLanguage);
    }
}

class Manager12 extends Employee12 {
    String department;

    void conductMeeting() {
        System.out.println("Manager conducts meeting for "
                + department + " department.");
    }

    public static void main(String[] args) {
        Developer12 d = new Developer12();

        d.employeeName = "Amit";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        Manager12 m = new Manager12();

        m.employeeName = "Rahul";
        m.employeeId = 102;
        m.department = "IT";

        System.out.println("Developer Details:");
        d.displayEmployee();
        d.writeCode();

        System.out.println();

        System.out.println("Manager Details:");
        m.displayEmployee();
        m.conductMeeting();
    }
}
