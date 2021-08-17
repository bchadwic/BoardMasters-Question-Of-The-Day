func getIntersectionNode(headA, headB *ListNode) *ListNode {
    set := make(map[*ListNode]bool)
    
    curr := headA
    for curr != nil {
        set[curr] = true
        curr = curr.Next
    }
    
    curr = headB
    for curr != nil {
        if _, ok := set[curr]; ok {
            return curr
        }
        curr = curr.Next
    }
    
    return nil
}
