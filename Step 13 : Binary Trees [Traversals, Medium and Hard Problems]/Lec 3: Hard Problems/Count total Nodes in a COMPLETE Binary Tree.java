class Solution {
    int r (TreeNode root)
    {
        if(root==null)
        return 0;
        return 1+r(root.right);
    }
    int l (TreeNode root)
    {
        if(root==null)
        return 0;
        return 1+l(root.left);
    }
    public int countNodes(TreeNode root) {
       int left = l(root);
       int right= r(root);
       if(left==right)
       return (1<<left)-1;
       return 1+countNodes(root.left)+countNodes(root.right);

    }
}