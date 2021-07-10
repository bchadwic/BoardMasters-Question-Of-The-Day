class Solution {
    public void moveZeroes(int[] nums) {
        
        Queue<Integer> nonzeros = new LinkedList<>();
        
        for(int num : nums)
            if(num != 0)
                nonzeros.add(num);
        
        Arrays.fill(nums, 0);
        
        for(int i = 0; !nonzeros.isEmpty(); i++)
            nums[i] = nonzeros.poll();
    }
}
