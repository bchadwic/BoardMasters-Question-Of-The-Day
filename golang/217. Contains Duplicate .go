func containsDuplicate(nums []int) bool {
    set := make(map[int]bool)
    
    for _, e := range nums {
        if _, ok := set[e]; ok {
            return true
        }
        set[e] = true
    }
    
    return false   
}
