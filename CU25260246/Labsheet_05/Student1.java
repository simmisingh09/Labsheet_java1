// Q1. Student Encapsulation
class Student1 {
    private String name;
    private int rollNo;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks: " + getMarks());
    }

    public static void main(String[] args) {
        Student1 s = new Student1();

        s.setName("Rahul");
        s.setRollNo(101);
        s.setMarks(85.5);

        s.displayDetails();
    }
}
