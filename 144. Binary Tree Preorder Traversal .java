class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }
    
    public void preorder(TreeNode curr, List<Integer> list){
        if(curr == null)
            return;
        list.add(curr.val);
        preorder(curr.left, list);
        preorder(curr.right, list);
    }
}
