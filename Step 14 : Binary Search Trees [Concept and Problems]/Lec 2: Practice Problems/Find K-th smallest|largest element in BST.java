class Solution {

    public void kth(TreeNode root, int k , int []c , int []ans) {
        if(root == null)
        return;
        kth(root.left,k,c,ans);
        c[0]++;
        if(c[0]==k)
        ans[0]=root.val;
        kth(root.right,k,c,ans);
    }

    public int kthSmallest(TreeNode root, int k) {

        int ans[]={0};
        int c[]={0};
        kth(root,k,c ,ans);
        return ans[0];
    }
}