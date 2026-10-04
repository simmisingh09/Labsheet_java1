// Q5. Person -> Student
class Person5 {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student5 extends Person5 {
    int rollNo;
    String course;

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student5 s = new Student5();

        s.name = "Amit";
        s.age = 20;
        s.rollNo = 101;
        s.course = "Java";

        s.displayStudent();
    }
}
