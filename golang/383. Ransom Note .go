func canConstruct(ransomNote string, magazine string) bool {
    needed := make(map[rune]int)
    for _, c := range magazine {
        needed[c]++
    }
    
    for _, c := range ransomNote {
        if needed[c] == 0 {
            return false
        }
        needed[c]--
    }
    
    return true
}
