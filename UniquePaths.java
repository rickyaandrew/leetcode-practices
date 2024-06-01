public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
            }
        }
        return grid[m - 1][n - 1];
    }
}
// public int uniquePaths(int m, int n) {
// return recurse(0, 0, n - 1, m - 1);
// }

// private int recurse(int x, int y, int fx, int fy) {
// int totalCount = 0;
// if (x == fx && y == fy) {
// return 1;
// }
// // taking x
// if (x < fx) {
// totalCount += recurse(x + 1, y, fx, fy);
// }
// //taking y
// if (y < fy) {
// totalCount += recurse(x, y + 1, fx, fy);
// }
// return totalCount;
// }
