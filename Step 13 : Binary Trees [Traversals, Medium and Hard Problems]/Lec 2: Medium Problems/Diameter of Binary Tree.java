class Solution {
    public int[] solve(TreeNode root)
  {
      if(root==null)
      return new int[]{0,0};
      int[] left = solve(root.left);
      int[] right = solve(root.right);
      return new int[]{1+Math.max(left[0],right[0]),Math.max(1+left[0]+right[0],Math.max(left[1],right[1]))};
  }
  public int diameterOfBinaryTree(TreeNode root) {

          int[] ans = solve(root);
          return ans[1]-1;
  }
}