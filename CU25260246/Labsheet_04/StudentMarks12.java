// 12. StudentMarks
class StudentMarks12 {
    int marks1, marks2, marks3;
    static String universityName = "ABC University";

    void average() {
        int m1 = marks1;
        int m2 = marks2;
        int m3 = marks3;
        double avg = (m1 + m2 + m3) / 3.0;

        System.out.println("University: " + universityName);
        System.out.println("Average: " + avg);
    }
}
