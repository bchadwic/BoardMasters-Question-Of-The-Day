func reverse(x int) int {
    negative := false
    if x < 0 {
        negative = true
        x *= -1
    }
    
    length := int(math.Log10(float64(x))) + 1
    
    stack := []int{}
    for i := 0; i < length; i++ {
        stack = append(stack, x % 10)
        x /= 10
    }
    
    x = 0
    for i := 0; i < length; i++ {
        x += stack[i]
        x *= 10
    }
    
    x /= 10
    
    if x > math.MaxInt32 {
        return 0
    }
    
    if negative {
        x *= -1
    }
    return x
}
