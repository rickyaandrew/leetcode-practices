/**
 * LongestCommonSubsequence
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int text1Length = text1.length();
        int text2Length = text2.length();

        int[][] dp = new int[text1Length + 1][text2Length + 1];

        for (int i = 1; i < text1Length; i++) {
            for (int j = 1; j < text2Length; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    Math.max(dp[i-1][j], dp[i-1][j-1]);
                }
            }
        }
        return dp[text1Length][text2Length];
    }

}

// int length1 = text1.length();
// int length2 = text2.length();

// int[][] dp = new int[length1 + 1][length2 + 1];

// for (int i = 1; i <= length1; ++i) {
// for (int j = 1; j <= length2; ++j) {
// if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
// dp[i][j] = dp[i - 1][j - 1] + 1;
// } else {
// dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
// }
// }
// }
// return dp[length1][length2];