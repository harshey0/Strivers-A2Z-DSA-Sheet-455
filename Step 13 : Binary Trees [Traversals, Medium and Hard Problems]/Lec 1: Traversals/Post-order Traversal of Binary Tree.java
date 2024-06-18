class Solution {
    private static List<Integer> postorder(TreeNode root ,List<Integer> list)
{
        if(root==null)
        return list;
        postorder(root.left , list);
        postorder(root.right , list);
        list.add(root.val);
        return list;
}
public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> post= new ArrayList();
            return postorder(root,post);        
}
}