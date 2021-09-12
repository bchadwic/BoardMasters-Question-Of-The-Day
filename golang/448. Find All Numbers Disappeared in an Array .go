
func findDisappearedNumbers(nums []int) []int {
    sw := make([]bool, len(nums)+1)
    for _, e := range nums {
        sw[e] = true
    }
    
    result := []int{}
    for i, e := range sw[1:]{
        if !e {
            result = append(result, i+1)
        }
    }
    return result
}

/*
attempt 1 - slower than attempt 2, but more reliable
    sw := make([]bool, len(nums)+1)
    for _, e := range nums {
        sw[e] = true
    }
    
    result := []int{}
    for i, e := range sw[1:]{
        if !e {
            result = append(result, i+1)
        }
    }
    return result
    
    
attempt 2 O(n), fast but uses a magic number 5
    for j := 0; j < 5; j++ {
        for i := 0; i < len(nums); i++ {
            nums[i], nums[nums[i]-1] = nums[nums[i]-1], nums[i] 
        }
    }
    
    result := []int{}
    for i, e := range nums{
        if i+1 != e {
            result = append(result, i+1)
        }
    }
    return result
*/
