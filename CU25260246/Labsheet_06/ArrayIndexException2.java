// Q2. Handling ArrayIndexOutOfBoundsException

import java.util.Scanner;

// Q2. Handling ArrayIndexOutOfBoundsException
class ArrayIndexException2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Element = " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }

        sc.close();
    }
}
