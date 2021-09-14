func largeGroupPositions(s string) [][]int {
    var res [][]int
    co := 1
    st := 0
    cur := s[0]
    for i := 1; i < len(s); i++ {
        if s[i] == cur {
            co++
        } else {
            if co >= 3 {
                res = append(res, []int{st, i - 1})  
            }   
            st = i
            co = 1    
            cur = s[i]
        }
    }
    if co >= 3 {
        res = append(res, []int{st, len(s)-1})  
    }   
    return res
}
