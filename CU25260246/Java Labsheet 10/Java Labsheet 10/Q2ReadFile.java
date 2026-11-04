import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Q2ReadFile {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("Student File Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File does not exist or cannot be read!");
        }
    }
}
