func twoSum(nums []int, target int) []int {
    set := make(map[int]int)

    for i, e := range nums {
        if j, ok := set[e]; ok {
            return []int{i, j}
        } 
        set[target - e] = i
    } 
    
    return nil
}
