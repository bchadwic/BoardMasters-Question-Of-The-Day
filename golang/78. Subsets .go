func subsets(nums []int) [][]int {
    subsets := [][]int{[]int{}}
    
    for _, num := range nums {
        for _, subset := range subsets {
            subsets = append(subsets, append([]int{num}, subset...))
        }
    }
    
    return subsets
}
