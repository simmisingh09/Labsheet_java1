// 26. Matrix
class Matrix26 {
    int[][] matrix = new int[2][2];
    static String matrixType = "2x2 Matrix";

    void addAndSubtract(Matrix26 other) {
        int[][] sum = new int[2][2];
        int[][] difference = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = this.matrix[i][j] + other.matrix[i][j];
                difference[i][j] =
                    this.matrix[i][j] - other.matrix[i][j];
            }
        }

        System.out.println("Matrix Type: " + matrixType);

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(difference[i][j] + " ");
            System.out.println();
        }
    }
}
