class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
            return 0;
        int minBuy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        }
        return maxProfit;
    }
}