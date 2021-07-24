func findCenter(edges [][]int) int {
    
    if a := edges[0][0]; a == edges[1][0] || a == edges[1][1] {
        return a
    }
    
    return edges[0][1]
}
