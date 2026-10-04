// 10. Movie
class Movie10 {
    String name, genre;
    double rating;
    static String industry = "Bollywood";

    void display() {
        String movieName = name;
        String movieGenre = genre;
        double movieRating = rating;
        System.out.println("Name: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Rating: " + movieRating);
        System.out.println("Industry: " + industry);
    }
}

