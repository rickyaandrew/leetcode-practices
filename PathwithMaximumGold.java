public class PathwithMaximumGold {
    int maxGold = 0;

    public int getMaximumGold(int[][] grid) {
        int counts = checkIfAllNonZeros(grid);
        if (counts != 0) {
            return counts;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    recursion(grid, 0, i, j);
                }
            }
        }
        return maxGold;
    }

    private int checkIfAllNonZeros(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    result += grid[i][j];
                } else {
                    return 0;
                }
            }
        }
        return result;
    }

    private void recursion(int[][] grid, int golds, int x, int y) {
        if (grid[x][y] == 0) {
            return;
        }

        golds += grid[x][y];
        int currGold = grid[x][y];
        grid[x][y] = 0;

        if (x + 1 < grid.length) {
            recursion(grid, golds, x + 1, y);
        }
        if (x - 1 >= 0) {
            recursion(grid, golds, x - 1, y);
        }
        if (y + 1 < grid[0].length) {
            recursion(grid, golds, x, y + 1);
        }
        if (y - 1 < grid[0].length) {
            recursion(grid, golds, x, y - 1);
        }
        grid[x][y] = currGold;
        maxGold = Math.max(golds, maxGold);
    }
    // int maxGold = 0;
    // int[] row = { 1, -1, 0, 0 };
    // int[] col = { 0, 0, -1, 1 };

    // private void backtrack(int[][] grid, int x, int y, int count) {
    // if (x < 0 || x > grid.length || y < 0 || y > grid[0].length) {
    // return;
    // }

    // if (grid[x][y] != 0) {
    // int currGold = grid[x][y];
    // grid[x][y] = 0;
    // count += currGold;
    // maxGold = Math.max(count, maxGold);
    // for (int i = 0; i < 4; i++) {
    // int newX = x + row[i];
    // int newY = y + col[i];
    // backtrack(grid, newX, newY, count);
    // }
    // grid[x][y] = currGold;
    // }
    // }

    // private int checkIfAllNonZeros(int[][] grid) {
    // int result = 0;
    // for (int i = 0; i < grid.length; i++) {
    // for (int j = 0; j < grid[0].length; j++) {
    // if (grid[i][j] != 0) {
    // result += grid[i][j];
    // } else {
    // return 0;
    // }
    // }
    // }
    // return result;
    // }

    // public int getMaximumGold(int[][] grid) {
    // int count = checkIfAllNonZeros(grid);
    // if (count != 0) {
    // return count;
    // }

    // for (int i = 0; i < grid.length; i++) {
    // for (int j = 0; j < grid[0].length; j++) {
    // if (grid[i][j] != 0) {
    // backtrack(grid, i, j, 0);
    // }
    // }
    // }
    // return maxGold;
    // }
}
