// Last updated: 7/28/2025, 6:14:38 PM
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int res = 0;
        int buyPrice = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(buyPrice > prices[i]) {
                buyPrice = prices[i];
            } 
            res = Math.max(res, prices[i] - buyPrice);
        } 
        return res;
       
    }
}