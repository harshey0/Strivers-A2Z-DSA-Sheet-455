class Solution {
    public TreeNode find(TreeNode root)
    {
        if(root==null || root.right==null)
        return root;
        return find(root.right);
    }
    public void flatten(TreeNode root)
    {
        if(root==null)
        return;
        TreeNode right= root.right;
        if(root.left!=null)
        {
        TreeNode left=root.left;
        root.left=null;
        root.right=left;
        flatten(root.right);
        root=find(root.right);
        }
        root.right=right;
        flatten(root.right);
    }
}