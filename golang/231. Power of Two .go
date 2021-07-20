func isPowerOfTwo(n int) bool {
    if n == 1 {
        return true
    }
    
    i := 1
    for i < n {
        i *= 2
        if i == n {
            return true
        }
    } 
    return false
}
