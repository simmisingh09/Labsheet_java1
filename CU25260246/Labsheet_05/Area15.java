// Q15. Shape Area Overriding
class Area15 {
    void calculateArea() {
        System.out.println("Area of shape.");
    }
}

class Circle15 extends Area15 {
    double radius = 5;

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle15 extends Area15  {
    double length = 10;
    double breadth = 5;

    @Override
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        Circle15 c = new Circle15();
        Rectangle15 r = new Rectangle15();

        c.calculateArea();
        r.calculateArea();
    }
}
