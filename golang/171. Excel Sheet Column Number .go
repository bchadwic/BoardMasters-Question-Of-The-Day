func titleToNumber(ct string) int {
    var total float64 = 0
    length := len(ct)
    for i := length - 1; i >= 0; i-- {
        curr := float64(ct[i] - 'A' + 1)
        multi := float64(length - i - 1)
        if multi > 0 {
            curr *= math.Pow(26, multi)
        }
        total += curr
    }
    return int(total)
}
