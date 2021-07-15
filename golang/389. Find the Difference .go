func findTheDifference(s string, t string) byte {
    var total int = 0
    
    for _, c := range t {
        total += int(c)
    }
    
    for _, c := range s {
        total -= int(c)
    }
    
    return byte(total)
}
