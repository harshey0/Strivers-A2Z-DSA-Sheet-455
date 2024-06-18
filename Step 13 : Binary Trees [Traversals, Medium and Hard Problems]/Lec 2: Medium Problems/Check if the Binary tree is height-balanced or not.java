class Solution {

    private int info(TreeNode root)
    {
        if(root==null)
        return 0;
        int left = info(root.left);
        int right = info(root.right);
        if(left==-1 || right== -1)
        return -1;
        if(Math.abs(left-right)>1 )
        return -1;
        else
            return Math.max(left,right)+1;
        
    }

    public boolean isBalanced(TreeNode root) {
        return info(root)!=-1;
    }
}