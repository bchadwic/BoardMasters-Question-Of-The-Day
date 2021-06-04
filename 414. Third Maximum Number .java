class Solution {
    /*
    NOTE: Collections.max(COLLECTION_NAME); finds the maximum value in a given collection, this would've made this solution a lot faster!!
    */
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>((x,y) -> Integer.compare(y, x));
        
        for(int num : nums){
            set.add(num);
        }
        
        if(set.size() < 3){
            for(int num : set){
                return num;
            }
        }
        
        int count = 0;
        for(int num : set){
            if(count == 2){
                return num;
            }
            count++;
        }
        
        return 0;
    }
}
