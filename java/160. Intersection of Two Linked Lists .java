public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            //we put the nodes in to set and then compare if we have node
            Set<ListNode> nodesInB = new HashSet<ListNode>();

            while (headB != null) {
                nodesInB.add(headB);
                headB = headB.next;
            }

            while (headA != null) {
                // if we find the node pointed to by headA,
                // in our set containing nodes of B, then return node
                if (nodesInB.contains(headA)) {
                    return headA;
                }
                headA = headA.next;
            }

            return null;
        }
    }
