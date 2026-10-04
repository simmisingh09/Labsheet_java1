// 17. StudentGrade
class StudentGrade17 {
    String name;
    int marks;
    static int passingMarks = 40;

    void assignGrade() {
        String studentName = name;
        int studentMarks = marks;
        char grade;

        if (studentMarks < passingMarks)
            grade = 'F';
        else if (studentMarks >= 80)
            grade = 'A';
        else if (studentMarks >= 60)
            grade = 'B';
        else
            grade = 'C';

        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + studentMarks);
        System.out.println("Grade: " + grade);
    }
}
