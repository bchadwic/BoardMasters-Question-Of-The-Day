func middleNode(head *ListNode) *ListNode {
    
    curr := head
    half := head
    
    for i := 1; curr != nil; i++ {
        if i%2 == 0 {
            half = half.Next
        }
        curr = curr.Next
    } 
    
    return half
}
