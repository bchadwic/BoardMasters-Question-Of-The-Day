class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    
    public void postorder(TreeNode curr, List<Integer> list){
        if(curr == null)
            return;
        postorder(curr.left, list);
        postorder(curr.right, list);
        list.add(curr.val);
    }
}
