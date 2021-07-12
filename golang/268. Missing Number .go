func missingNumber(nums []int) int {
    expected := 0
    total := 0
    i := 0
    
    for _, e := range nums {
        total += e
        expected += i
        i++
    }
    expected += i
    
    return expected - total
    
}
