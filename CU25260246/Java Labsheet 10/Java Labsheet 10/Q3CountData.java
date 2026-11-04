import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Q3CountData {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Java is easy\n");
            writer.write("Java is powerful\n");
            writer.write("I love programming");

            writer.close();

            BufferedReader br =
                    new BufferedReader(new FileReader("data.txt"));

            String line;

            int lines = 0;
            int words = 0;
            int characters = 0;

            while ((line = br.readLine()) != null) {

                lines++;

                characters += line.length();

                String[] arr = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    words += arr.length;
                }
            }
            br.close();

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters: " + characters);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
