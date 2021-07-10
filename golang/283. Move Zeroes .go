func moveZeroes(nums []int)  {
    j := 0;
    
    for i, e := range nums {
        if e != 0 {
            nums[j] = nums[i] 
            j++
        }
    }
    
    for ; j < len(nums); j++ {
        nums[j] = 0
    } 
}
