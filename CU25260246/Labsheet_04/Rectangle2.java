// 2. Rectangle
class Rectangle2 {
    int length, breadth;
    static String shapeName = "Rectangle";

    void area() {
        int l = length;
        int b = breadth;
        int area = l * b;
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + area);
    }
}

