class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length < 3){
            return Math.min(cost[0], cost[1]);
        }
        
        int[] stairs = new int[cost.length + 1];
        stairs[0] = cost[0];
        stairs[1] = cost[1];
        
        for(int i = 2; i < cost.length; i++){
            stairs[i] = Math.min(stairs[i - 2], stairs[i - 1]) + cost[i];
        }
        
        stairs[cost.length] = Math.min(stairs[cost.length - 2], stairs[cost.length - 1]);
        return stairs[cost.length];
    }
}
