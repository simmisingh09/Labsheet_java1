// 5. Book
class Book5 {
    String title, author;
    double price;
    static String publisher = "ABC Publications";

    void display() {
        String bookTitle = title;
        String bookAuthor = author;
        double bookPrice = price;
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
        System.out.println("Publisher: " + publisher);
    }
}
