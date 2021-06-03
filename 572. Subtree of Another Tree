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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        List<TreeNode> validStarts = new ArrayList<>();
        getValidStartingPoints(root, subRoot, validStarts);
        
        for(TreeNode start : validStarts)
            if(compareTrees(start, subRoot))
                return true;
        
        return false;
    }
    
    private boolean compareTrees(TreeNode rootCurr, TreeNode subRootCurr){
        // if they both reach the end of there trees return true
        if(subRootCurr == null && rootCurr == null)
            return true;
        
        // XOR test to see if one is null but not the other
        if(subRootCurr == null || rootCurr == null && !(subRootCurr == null && rootCurr == null))
            return false;
        
        
        if(rootCurr.val != subRootCurr.val) // be sure to test whether they are the same values
            return false;
        
        boolean result = true; // &= to make sure you retain the result from recursion calls
        result &= compareTrees(rootCurr.left, subRootCurr.left);
        result &= compareTrees(rootCurr.right, subRootCurr.right);
        
        return result;
    }
    
    private void getValidStartingPoints(TreeNode curr, TreeNode subRoot, List<TreeNode> validStarts){
        if(curr == null)
            return;
        
        // add all the nodes that have the same value as the start of subRootCurr
        if(curr.val == subRoot.val) 
            validStarts.add(curr);
        
        getValidStartingPoints(curr.right, subRoot, validStarts);
        getValidStartingPoints(curr.left, subRoot, validStarts);
    } 
}
