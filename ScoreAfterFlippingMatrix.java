public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int res = (1 << (cols - 1)) * rows;

        for (int j = 1; j < cols; j++) {
            int val = 1 << (cols - 1 - j);
            int set = 0;

            for (int i = 0; i < rows; i++) {
                if (grid[i][j] == grid[i][0]) {
                    set++;
                }
            }

            res += Math.max(set, (rows - set)) * val;
        }
        return res;
    }
}
