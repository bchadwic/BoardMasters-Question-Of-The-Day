func removeElements(head *ListNode, val int) *ListNode {
    curr := head
    var prev *ListNode
    
    for curr != nil {
        if curr.Val != val {
            prev = curr
        } else {
            if prev == nil {
                head = head.Next
            } else {
                prev.Next = curr.Next
            }
        }
        curr = curr.Next
    }
    return head
}
