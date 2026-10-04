// Q6. Employee -> Manager with Encapsulation
class Employee6 {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager6 extends Employee6 {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    void displayManager() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDepartment());
    }

    public static void main(String[] args) {
        Manager6 m = new Manager6();

        m.setName("Rahul");
        m.setSalary(75000);
        m.setDepartment("IT");

        m.displayManager();
    }
}
