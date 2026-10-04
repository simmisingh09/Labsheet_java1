// 30. Library
class Lib30 {
    int booksAvailable;
    static String libraryName = "City Library";

    void issueBook() {
        int available = booksAvailable;

        if (available > 0) {
            available--;
            booksAvailable = available;
            System.out.println("Book Issued Successfully");
        } else {
            System.out.println("No Books Available");
        }

        System.out.println("Books Available: " + booksAvailable);
    }

    void returnBook() {
        int available = booksAvailable;
        available++;
        booksAvailable = available;

        System.out.println("Book Returned Successfully");
        System.out.println("Books Available: " + booksAvailable);
    }
}
