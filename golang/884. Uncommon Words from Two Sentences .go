func uncommonFromSentences(s1 string, s2 string) []string {
    
    m := make(map[string]int)
    
    for _, e := range strings.Split(s1, " ") {
        m[e]++
    }
    
    for _, e := range strings.Split(s2, " ") {
        m[e]++
    }
    
    s := make([]string, 0)
    for k, v := range m {
        if v == 1 {
            s = append(s, k)
        }
    }
    
    return s
}
