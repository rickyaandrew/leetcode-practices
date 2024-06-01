import java.util.Arrays;

public class BestTimetoBuyandSellStockwithCooldown {
    public int maxProfit(int[] prices) {
        int[] s0 = new int[prices.length];
        int[] s1 = new int[prices.length];
        int[] s2 = new int[prices.length];

        Arrays.fill(s0, 0);
        Arrays.fill(s1, 0);
        Arrays.fill(s2, 0);

        s1[0] = -prices[0];
        s0[0] = 0;
        s2[0] = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length; i++) {
            s0[i] = Integer.max(s0[i - 1], s2[i - 1]);
            s1[i] = Integer.max(s1[i - 1], s0[i - 1] - prices[i]);
            s2[i] = prices[i] + s1[i - 1];
        }
        return Integer.max(s0[prices.length - 1], s2[prices.length - 1]);
    }
}
