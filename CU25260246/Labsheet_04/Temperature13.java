// 13. Temperature
class Temperature13 {
    double celsius;
    static String scale = "Celsius";

    void convert() {
        double c = celsius;
        double fahrenheit = (c * 9 / 5) + 32;
        double kelvin = c + 273.15;

        System.out.println("Scale: " + scale);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}
