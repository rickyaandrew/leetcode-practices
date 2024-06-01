public class RotateImage {
    //to rotate the image, we need to transpose the image, then flip the image
    public void rotate(int[][] matrix) {
        //transpose the image

        // 1 2 3        1 4 7
        // 4 5 6        2 5 8
        // 7 8 9        3 6 9

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //to flip the image

        // 1 2 3        3 2 1
        // 4 5 6        6 5 4
        // 7 8 9        9 8 7
        for (int i = 0; i < matrix.length; i++) {
            int pointer = matrix[i].length - 1;
            for (int j = 0; j <= pointer; j++) {
                int temp = matrix[i][pointer];
                matrix[i][pointer] = matrix[i][j];
                matrix[i][j] = temp;
                pointer--;
            }
        }
    }
}
