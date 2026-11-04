import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Q6SearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("notes.txt");

            writer.write("Java is easy. Java is powerful. I love Java.");

            writer.close();

            System.out.print("Enter word to search: ");
            String search = sc.nextLine();

            BufferedReader br =
                    new BufferedReader(new FileReader("notes.txt"));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {

                    word = word.replaceAll(
                            "^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");

                    if (word.equalsIgnoreCase(search)) {
                        count++;
                    }
                }
            }

            br.close();

            if (count > 0) {
                System.out.println("Word Found!");
                System.out.println("Occurrences: " + count);
            } else {
                System.out.println("Word Not Found!");
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
