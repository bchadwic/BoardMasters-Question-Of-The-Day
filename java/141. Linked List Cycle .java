public class Solution {
    public boolean hasCycle(ListNode head) {

        //we use the hashtable to save 
        Set<ListNode> seen = new HashSet<>();


        while( head != null){

            if(seen.contains(head)) {return true;}
            seen.add(head);

            head = head.next;
        }
        return false;
    }
}
