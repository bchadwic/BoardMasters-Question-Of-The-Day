func maximumProduct(nums []int) int {
    
    a := nums[0]
    b := nums[1]
    c := nums[2]
    
    if a > b {
        a, b = b, a
    }
    
    if b > c {
        b, c = c, b
    }
    
    if a > b {
        a, b = b, a
    }
    
    
    min := []int{c, b, a}
    max := []int{a, b, c}
    
    for _, e := range nums[3:] {
        if e < min[0] {
            if e < min[1] {
                if e < min[2] {
                    min[0] = min[1]
                    min[1] = min[2]
                    min[2] = e 
                    goto next
                }
                min[0] = min[1]
                min[1] = e
                goto next
            }   
            min[0] = e
            goto next
        }  
        next:
        if e > max[0] {
            if e > max[1] {
                if e > max[2] {
                    max[0] = max[1]
                    max[1] = max[2]
                    max[2] = e 
                    continue
                }
                max[0] = max[1]
                max[1] = e
                continue
            }   
            max[0] = e
            continue
        }
    }
    
    result1 := min[1] * min[2] * max[2]
    result2 := max[0] * max[1] * max[2]
    
    if result1 > result2 {
        return result1
    }
    return result2
}
    
