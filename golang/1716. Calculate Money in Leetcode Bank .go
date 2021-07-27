// f(n) { 1 + 2 + 3 + 4 + 5 ... + n } == (n * (n - 1)) / 2
func totalMoney(n int) int {
    
    total := 0
    weeks := n / 7
    
    for i := 0; i < weeks; i++ {
      total += 28 + (i * 7) // (8 * (8 - 1)) + (i * 7)
    }
    
    rem := n % 7 + 1
    return total + ((rem * (rem - 1)) / 2) + (weeks * (rem - 1))
}
