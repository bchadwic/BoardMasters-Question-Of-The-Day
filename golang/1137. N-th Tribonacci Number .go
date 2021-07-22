func tribonacci(n int) int {
    memo := make([]int, n + 1)
    return trib(n, memo)
}

func trib(n int, memo []int) int {
    if memo[n] == 0 {
        if n < 1 {
            return 0
        } else if n == 2 || n == 1 {
            return 1
        } 
        
        memo[n] = trib(n - 1, memo) + trib(n - 2, memo) + trib(n - 3, memo)
    } 
    return memo[n]
}
