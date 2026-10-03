import java.util.Scanner;

public class CharacterTypeQ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String type = (ch >= '0' && ch <= '9')
                ? "Digit"
                : ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')
                    ? (((ch == 'a' || ch == 'e' || ch == 'i' ||
                          ch == 'o' || ch == 'u' || ch == 'A' ||
                          ch == 'E' || ch == 'I' || ch == 'O' ||
                          ch == 'U')
                        ? "Vowel" : "Consonant"))
                    : "Special Symbol");

        System.out.println("Character type: " + type);

        sc.close();
    }
}
