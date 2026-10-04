
class Triangle16 {
    int a, b, c;
    static String type = "Scalene/Isosceles/Equilateral";

    void checkValidity() {
        int x = a;
        int y = b;
        int z = c;

        if (x + y > z && x + z > y && y + z > x) {
            System.out.println("Valid Triangle");

            if (x == y && y == z)
                System.out.println("Type: Equilateral");
            else if (x == y || y == z || x == z)
                System.out.println("Type: Isosceles");
            else
                System.out.println("Type: Scalene");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}

