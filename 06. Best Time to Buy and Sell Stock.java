// Brute
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        
        return maxProfit > 0 ? maxProfit : 0;
    }
}

// Optimal -> GREEDY
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBid = prices[0];
        for(int i = 1; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - minBid);
            minBid = Math.min(minBid, prices[i]);
        }
        return maxProfit;
    }
}
