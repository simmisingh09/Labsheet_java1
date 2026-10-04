// 29. Employee
class Employee29 {
    String name;
    double salary;
    static String organization = "ABC Organization";

    static void compareSalaries(Employee29 emp1, Employee29 emp2) {
        String name1 = emp1.name;
        String name2 = emp2.name;
        double salary1 = emp1.salary;
        double salary2 = emp2.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2)
            System.out.println(name1 + " has higher salary.");
        else if (salary2 > salary1)
            System.out.println(name2 + " has higher salary.");
        else
            System.out.println("Both employees have equal salary.");
    }
}
