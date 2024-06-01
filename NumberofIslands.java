public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int result = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    coverIsland(grid, i, j);
                }
            }
        }
        return result;
    }

    private void coverIsland(char[][] grid, int row, int col) {
        if (grid[row][col] == '1') {
            grid[row][col] = '0';
        } else {
            return;
        }

        if (row > 0) {
            coverIsland(grid, row - 1, col);
        }

        if (row < grid.length - 1) {
            coverIsland(grid, row + 1, col);
        }
        if (col > 0) {
            coverIsland(grid, row, col - 1);
        }

        if (col < grid[0].length - 1) {
            coverIsland(grid, row, col + 1);
        }

    }
}
