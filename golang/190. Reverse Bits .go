func reverseBits(num uint32) uint32 {
    
    var rev uint32 = math.MaxUint32 
    var mask uint32 = 1 << 31 
    
    for i := 0; i < 32; i++ {
        if mask & num == 0 {
            rev = rev ^ (1 << i) 
        } 
        mask = mask >> 1
    }
    return rev
}
