class Solution {
    public int missingNumber(int[] nums) { // o(n) time, o(n) space
        
        Set<Integer> seen = new HashSet<>();
        
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            seen.add(num);
            max = Math.max(max, num);
        }
        
        for(int i = 0; i <= max; i++)
            if(!seen.contains(i))
                return i;
        
        return max + 1;
        
    }
}
