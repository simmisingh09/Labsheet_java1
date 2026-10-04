class Employee4 {
    int empId;
    double salary;
    static String companyName = "ABC Company";

    void display() {
        int id = empId;
        double sal = salary;
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + sal);
        System.out.println("Company: " + companyName);
    }
}