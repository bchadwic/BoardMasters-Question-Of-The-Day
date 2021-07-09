class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }
    
    public void inorder(TreeNode curr, List<Integer> list){
        if(curr == null)
            return;
        inorder(curr.left, list);
        list.add(curr.val);
        inorder(curr.right, list);
    }
}
