// Q11. Person -> Student and Teacher
class Person_11 {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student11 extends Person_11 {
    String course;

    void study() {
        System.out.println(name + " is studying " + course);
    }
}

class Teacher11 extends Person_11 {
    String subject;

    void teach() {
        System.out.println(name + " is teaching " + subject);
    }

    public static void main(String[] args) {
        Student11 s = new Student11();
        s.name = "Rahul";
        s.course = "Computer Science";

        Teacher11 t = new Teacher11();
        t.name = "Mr. Sharma";
        t.subject = "Java";

        s.displayName();
        s.study();

        t.displayName();
        t.teach();
    }
}
