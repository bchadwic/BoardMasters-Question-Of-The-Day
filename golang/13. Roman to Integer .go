func romanToInt(s string) int {
    total := 0
    
    for i := 0; i < len(s); i++ { // scan string for the exceptions listed in prompt
        a := s[i]
        if i != len(s) - 1 {
            b := s[i+1]
            if a == 'I'{
                if b == 'V' || b == 'X' {
                    total -= 2 // subtract the exception amount
                }
            }
            if a == 'X' {
                if b == 'L' || b == 'C' {
                    total -= 20
                }
            }
            if a == 'C' {
                if b == 'D' || b == 'M' {
                    total -= 200
                }
            }
        }
        switch a { // add values as there normal amount given the exceptions are being handled
            case 'I':
                total += 1
            case 'V':
                total += 5
            case 'X':
                total += 10
            case 'L':
                total += 50
            case 'C':
                total += 100
            case 'D':
                total += 500
            case 'M':
                total += 1000
        }
    }
    
    return total
}
