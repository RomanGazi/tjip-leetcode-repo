class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, currentBuying = prices[0];
        for(int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - currentBuying);
            if(currentBuying > prices[i]) {
                currentBuying = prices[i];
            }
        }
        return profit;
    }
}

/*
Idea:
Keep track of lowest value. In every iteration calculate profit and check current value is lower than the previous buying value.
*/
