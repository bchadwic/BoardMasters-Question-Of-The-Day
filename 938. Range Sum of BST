/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int rangeSumBST(TreeNode root, int low, int high) {
        int total = 0;
        if(root == null)
            return total;
        
        if(root.val >= low && root.val <= high)
            total += root.val;
        if(root.val > low)
            total += rangeSumBST(root.left, low, high);
        if(root.val < high)
            total += rangeSumBST(root.right, low, high);
        
        return total;
    }
}
