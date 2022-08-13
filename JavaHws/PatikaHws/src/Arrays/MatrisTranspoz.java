package Arrays;

public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Transpose Matrix: ");
        for (int[] row : transposeMatrix) {
            for (int col : row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
}
