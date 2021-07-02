class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        Set<Integer> seen = new HashSet();
        
        for(int num : nums)
            if(seen.contains(num)) {
                result -= num;
            } else { 
                result += num;
                seen.add(num);
            }
        
        return result;
        
    }
}
