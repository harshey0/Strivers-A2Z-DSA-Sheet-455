class Solution {
    public boolean check(TreeNode left , TreeNode right)
    {
        return (
            (left==null && right== null) || 
        (left != null && right!=null &&
            left.val == right.val && 
        check(left.left , right.right) && 
        check(left.right , right.left))
        );
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }
}