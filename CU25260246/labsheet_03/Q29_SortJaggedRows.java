import java.util.Scanner;

public class Q29_SortJaggedRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements in row "
                    + (i + 1) + ": ");

            int size = sc.nextInt();
            arr[i] = new int[size];

            System.out.println("Enter elements:");

            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Sort each row using bubble sort
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[i].length - 1 - j; k++) {

                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("\nSorted Jagged Array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
