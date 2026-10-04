class Pen8 {
    String color, type;
    static String manufacturer = "Cello";

    void display() {
        String penColor = color;
        String penType = type;
        System.out.println("Color: " + penColor);
        System.out.println("Type: " + penType);
        System.out.println("Manufacturer: " + manufacturer);
    }
}