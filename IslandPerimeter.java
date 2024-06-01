public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int parameter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    parameter += 4;
                    if (i > 0) {
                        parameter = grid[i - 1][j] == 1 ? parameter - 2 : parameter;
                    }
                    if (j > 0) {
                        parameter = grid[i][j - 1] == 1 ? parameter - 2 : parameter;
                    }

                }
            }
        }
        return parameter;
    }
}
