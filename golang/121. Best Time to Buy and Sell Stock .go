func maxProfit(prices []int) int {
    if len(prices) == 0 {
        return 0
    }
    
    max, level := 0, prices[0]
    for _, price := range prices[1:] { 
        max = maximum(max, price - level)
        if price < level {
            level = price
        }
    }
    
    return max 
}

func maximum(a int, b int) int {
    if a > b {
        return a
    }
    return b
}
