// 9. Laptop
class Laptop9 {
    String brand;
    int RAM;
    static String os = "Windows";

    void display() {
        String laptopBrand = brand;
        int laptopRAM = RAM;
        System.out.println("Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("OS: " + os);
    }
}
