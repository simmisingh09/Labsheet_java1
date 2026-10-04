// 1. Student
class Student1 {
    String name;
    int age;
    static int count = 0;

    void display() {
        String studentName = name;
        int studentAge = age;
        count++;
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Count: " + count);
    }
}

    
