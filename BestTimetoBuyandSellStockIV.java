public class BestTimetoBuyandSellStockIV {
    public int maxProfit(int b, int[] s) {
        int[][] prev = new int[2][b + 1];
        int[][] cur = new int[2][b + 1];
        for (int i = s.length - 1; i >= 0; i--) {
            for (int j = 0; j <= 1; j++) {
                for (int k = 1; k <= b; k++) {

                    if (j == 1) { // if can buy then u can check profit for buying now or buying at i+1 index
                        cur[j][k] = Math.max(-s[i] + prev[0][k], 0 + prev[1][k]);
                    } else {
                        cur[j][k] = Math.max(s[i] + prev[1][k - 1], prev[0][k]);
                    }

                }
            }
            prev = cur;
        }
        return prev[1][b];

    }
}
