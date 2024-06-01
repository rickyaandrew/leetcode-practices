import java.util.Arrays;

public class MinimumScoreTriangulationofPolygon {
    int[][] dp;

    public int minScoreTriangulation(int[] values) {
        int l = values.length;
        dp = new int[l][l];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return solve(values, 1, l - 1);
    }

    public int solve(int[] values, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int temp = solve(values, i, k) + solve(values, k + 1, j) +
                    values[i - 1] * values[k] * values[j];
            min = Math.min(min, temp);
        }

        return dp[i][j] = min;
    }
}
