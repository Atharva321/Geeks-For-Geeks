// Time  : O(n)
// Space : O(1)

class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        
        int profit = 0;
        for (int i = 1; i < n; i++) {
            int currProfit = 0;
            if (prices[i] > prices[i - 1])
                currProfit = prices[i] - prices[i - 1];
                profit = profit + currProfit;
        }
        return profit;
    }
}
