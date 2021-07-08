class Solution {
    public int maxProfit(int[] prices) {
        
        int max = Integer.MIN_VALUE;
        int level = 0;
        
        for(int i = 0; i < prices.length - 1; i++){
            if(level < 0) level = 0;
            level += prices[i + 1] - prices[i];
            max = Math.max(level, max);
        }
        
        return max < 0 ? 0 : max;
    }
}
