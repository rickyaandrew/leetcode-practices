public class OutofBoundaryPaths {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        return resursive(m, n, maxMove, startRow, startColumn);
    }

    private int resursive(int m, int n, int maxMove, int startRow, int startColumn) {
        if ((startRow < 0 || startColumn < 0 || startRow >= m || startColumn >= n) && maxMove <= 0) {
            return 1;
        }
        if (maxMove <= 0) {
            return 0;
        }
        int count = 0;
        // move up
        count = count + resursive(m, n, maxMove - 1, startRow - 1, startColumn);
        // move down
        count = count + resursive(m, n, maxMove - 1, startRow + 1, startColumn);
        // move left
        count = count + resursive(m, n, maxMove - 1, startRow, startColumn - 1);
        // move right
        count = count + resursive(m, n, maxMove - 1, startRow, startColumn + 1);
        return count;
    }

    public int dpSol(int m, int n, int N, int x, int y) {
        final int M = 1000000000 + 7;
        int[][] dp = new int[m][n];
        dp[x][y] = 1;
        int count = 0;

        for (int moves = 1; moves <= N; moves++) {
            int[][] temp = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == m - 1)
                        count = (count + dp[i][j]) % M;
                    if (j == n - 1)
                        count = (count + dp[i][j]) % M;
                    if (i == 0)
                        count = (count + dp[i][j]) % M;
                    if (j == 0)
                        count = (count + dp[i][j]) % M;
                    temp[i][j] = (((i > 0 ? dp[i - 1][j] : 0) + (i < m - 1 ? dp[i + 1][j] : 0)) % M +
                            ((j > 0 ? dp[i][j - 1] : 0) + (j < n - 1 ? dp[i][j + 1] : 0)) % M) % M;
                }
            }
            dp = temp;
        }

        return count;
    }
}
