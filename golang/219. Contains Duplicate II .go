func containsNearbyDuplicate(nums []int, k int) bool {
    // solution 2 runtime - O(n), space O(n)
    lastSeen := make(map[int]int)      
    
    for i, e := range nums {
        if j, ok := lastSeen[e]; ok && i - j <= k {
            return true
        }
        lastSeen[e] = i
    }
    return false
}
/*
solution 1 runtime - O(n^2)), space O(1)
for i := 0; i < len(nums); i++ {
    for j := i + 1; j < len(nums) && j - i <= k; j++ {
        if nums[i] == nums[j] {
            return true
        }
    }
}
return false
*/
