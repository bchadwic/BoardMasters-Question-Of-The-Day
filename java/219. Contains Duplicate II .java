class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*
        If indices i and j are in the same nums[], and abs(i - j)
        cannot be > k, then the distance between duplicates in nums[]
        is limited to be <= k. Using a HashSet, we can loop through
        nums[], adding its values to the HashSet until HashSet.size()
        is > k or a matching value is found in the Hashset.

        If HashSet.size() > k, we can safely remove a value from the
        HashSet because it is no longer a candidate. Values are removed
        from the HashSet in the order they were added, beginning with
        i=0 collection[i++], incrementing the counter with each removal,
        keeping the variable pointed at the earliest added remaining value.

        If we attempt to add a value to the HashSet that already exists
        and the HashSet.size() <= k, then we've found distinct, matching
        values at i and j, and abs(i - j) <= k.

        Credit to leetcode.com user vidhushini1993, whose post helped me
        fine-tune my code.
        */

        Set<Integer> hashSet = new HashSet<>();

        int i = 0;
        for(int num : nums) {
            if(!(hashSet.add(num))){
                return true;
            }
            if(hashSet.size() > k){
                hashSet.remove(nums[i++]);
            }
        }
        return false;
    }
}

/*First attempt, naive approach, nearly twice as slow as the preceding code

    HashMap<Integer, Integer> map = new HashMap<>();

    //Load all integers into a Hashmap
    for(int i=0; i < nums.length; i++){

        //If the map already contains the value
        if(map.containsKey(nums[i])){
            //Check
            if(Math.abs(nums[i] - map.get(i)) <= k){
                return true;
            }
        }
        map.put(nums[i], i);
    }

    return false;
*/