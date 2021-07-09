class Solution {
    public int majorityElement(int[] nums) { // inefficient solution
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        
        for(Map.Entry<Integer,Integer> pair : freq.entrySet())
            if(pair.getValue() > nums.length / 2)
                return pair.getKey();
            
        return -1;
     }
}
