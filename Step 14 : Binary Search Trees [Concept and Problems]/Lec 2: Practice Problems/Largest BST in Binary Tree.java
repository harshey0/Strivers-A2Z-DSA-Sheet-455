class Solution{
    
    static int[] largest(Node root) {
      if (root == null) {
          return new int[]{1,0, Integer.MIN_VALUE, Integer.MAX_VALUE};
      }
      int[] left = largest(root.left);
      int[] right = largest(root.right);
      
      if (left[0]==0 || right[0]==0|| root.data <= left[2] || root.data >= right[3]) {
          return new int[]{0, Math.max(left[1], right[1]) ,0 , 0};
      } else {
          return new int[]{1, 1 + left[1] + right[1] , Math.max(root.data,right[2]) , Math.min(root.data,left[3])};
      }
  }
  // Return the size of the largest sub-tree which is also a BST
  static int largestBst(Node root) {
      int[] result = largest(root);
      return result[1];
  }
}