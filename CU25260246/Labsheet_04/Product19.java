// 19. Product
class Product19 {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    void calculateFinalPrice() {
        int productId = id;
        String productName = name;
        double productPrice = price;

        double discount = productPrice * discountRate / 100;
        double finalPrice = productPrice - discount;

        System.out.println("ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + productPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
}
