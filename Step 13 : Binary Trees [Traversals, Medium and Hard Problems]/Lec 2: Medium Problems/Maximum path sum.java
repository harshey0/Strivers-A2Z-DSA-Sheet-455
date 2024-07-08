class Solution {
    public int[] solve(TreeNode root)
       {
           if(root==null)
           return new int[]{Integer.MIN_VALUE/3,Integer.MIN_VALUE/3};
           int[] left = solve(root.left);
           int[] right = solve(root.right);
           int k= root.val+Math.max(left[0],right[0]);
           int p=Math.max(k, root.val);
           return new int[]{p,Math.max(p,Math.max(root.val+left[0]+right[0],Math.max(left[1],right[1])))};
       }
       public int maxPathSum(TreeNode root) {
           int[] ans = solve(root);
           return ans[1];
       }
   }