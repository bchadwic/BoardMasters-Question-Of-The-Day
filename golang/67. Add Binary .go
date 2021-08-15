func addBinary(a string, b string) string {
    if(len(a) < len(b)){
        return addBinary(b, a)
    }
    
    diff := len(a) - len(b)
    var sb strings.Builder
    
    for i := 0; i < diff; i++ { // strategy could be made more efficient, I found this to be a "readable" solution
        sb.WriteByte('0')
    }
    
    b = sb.String() + b
    rem := false
    var result string
    
    for i := len(a) - 1; i >= 0; i-- {
        j := a[i] == '1'
        k := b[i] == '1'
        
        if rem {
            if j && k {
                result = "1" + result
            } else if j || k {
                result = "0" + result
            } else {
                result = "1" + result
                rem = false
            }
        } else {
            if j && k {
                result = "0" + result
                rem = true
            } else if j || k {
                result = "1" + result
            } else {
                result = "0" + result
            }
        }
    }
    if rem {
        result = "1" + result
    }
    
    return result
}
