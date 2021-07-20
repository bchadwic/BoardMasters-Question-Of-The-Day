func isPowerOfTwo(n int) bool {
    for i := 1; i <= n; i *= 2 {
        if i == n {
            return true
        }
    } 
    return false
}
