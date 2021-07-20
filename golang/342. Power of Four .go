func isPowerOfFour(n int) bool {
    for i := 1; i <= n; i *= 4 {
        if i == n {
            return true
        }
    }
    return false
}
