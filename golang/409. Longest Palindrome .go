func longestPalindrome(s string) int {
    
    letters := make(map[rune]int)
    
    for _, c := range s {
        letters[c]++
    }
    
    total := 0
    hasSingle := false
    for _, v := range letters {
        if v % 2 == 0 {
            total += v
        } else {
            total += v - 1
            if !hasSingle && v > 0 {
                hasSingle = true
                total++
            }
        }
    }

    return total 
} 
