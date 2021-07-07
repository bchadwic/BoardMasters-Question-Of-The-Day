class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null)
            return null;
        
        if(head.next == null)
            return head;
        
        ListNode curr = head.next;
        ListNode prev = head;
        
        while(curr != null){
            if(curr.val != prev.val){
                prev.next = curr;
                prev = curr;
            }
            curr = curr.next;
        }
        
        prev.next = null;
        
        return head;
    }
}
