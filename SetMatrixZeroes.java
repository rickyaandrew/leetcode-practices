import java.util.Arrays;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] isZero = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    isZero[i][j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (isZero[i][j]) {
                    makeZero(matrix, i, j);
                }
            }
        }
    }

    private void makeZero(int[][] matrix, int row, int col) {
        Arrays.fill(matrix[row], 0);; i++) {
            matrix[i][col] = 0;
        }
    }
}
