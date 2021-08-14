func hasCycle(head *ListNode) bool {
    curr := head 
    set := make(map[*ListNode]bool)
    
    for curr != nil {
        if ok, _ := set[curr]; ok {
            return true
        }
        set[curr] = true
        curr = curr.Next
    }
    return false
}
