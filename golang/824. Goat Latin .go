func toGoatLatin(sentence string) string {
    split := strings.Split(sentence, " ")
    vowels := map[byte]bool{
        'a': true,
        'e': true,
        'i': true,
        'o': true,
        'u': true,
        'A': true,
        'E': true,
        'I': true,
        'O': true,
        'U': true,
    }
    
    var b strings.Builder
    for i, e := range split {
        if vowels[e[0]] {
            b.WriteString(e)  
        } else {
            b.WriteString(e[1:])   
            b.WriteByte(e[0])
        }
        
        b.WriteString("ma")
        for k := 0; k < i + 1; k++ {
            b.WriteString("a")
        }
        
        if i != len(split) - 1{
            b.WriteString(" ")
        }
    }
    
    return b.String()
}
