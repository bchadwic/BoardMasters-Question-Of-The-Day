func sortColors(nums []int) { // O(n) time, O(n) space 
    var colors = []int{0, 0, 0}
    for _, e := range nums {
        colors[e]++
    }
    last := 0
    for i := 0; i < 3; i++ {
        for j, _ := range nums[last:last + colors[i]]{
            nums[j+last] = i 
        }
        last += colors[i]
    }
}
