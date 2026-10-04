// Q19. Employee -> Developer + Programmer + Researcher

class Employee19 {

    private String name;
    private int employeeId;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
    }
}

interface Programmer19 {

    void writeCode();
}

interface Researcher19 {

    void conductResearch();
}

class Developer19 extends Employee19
        implements Programmer19, Researcher19 {

    @Override
    public void writeCode() {
        System.out.println("Developer is writing code.");
    }

    @Override
    public void conductResearch() {
        System.out.println("Developer is conducting research.");
    }

    public static void main(String[] args) {

        Developer19 developer = new Developer19();

        developer.setName("Rahul");
        developer.setEmployeeId(101);

        developer.displayEmployee();
        developer.writeCode();
        developer.conductResearch();
    }
}
