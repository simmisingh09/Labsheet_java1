// Q8. Person -> Employee -> Manager
class Person8 {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee8 extends Person8 {
    int employeeId;

    void displayEmployee() {
        displayName();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager8 extends Employee8 {
    String department;

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager8 m = new Manager8();

        m.name = "Amit";
        m.employeeId = 101;
        m.department = "Finance";

        m.displayManager();
    }
}
