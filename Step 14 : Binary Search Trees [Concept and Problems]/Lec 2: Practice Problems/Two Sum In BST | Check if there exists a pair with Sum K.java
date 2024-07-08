class Solution {
    public void getright(Stack<TreeNode> right ,TreeNode root) {
        if(root==null)
        return;
        right.push(root);
        getright(right,root.right);
    }
    public void getleft(Stack<TreeNode> left , TreeNode root) {
        if(root==null)
        return;
        left.push(root);
        getleft(left,root.left);
    }

    public boolean findTarget(TreeNode root, int k) {
       Stack<TreeNode> left = new Stack<>();
       Stack<TreeNode> right = new Stack<>();
       getright(right,root);
       getleft(left,root);

       while(left.peek() != right.peek())
       {
       if(left.peek().val+right.peek().val==k)
       return true;
       else if(left.peek().val+right.peek().val<k)
       {TreeNode temp = left.pop();getleft(left,temp.right);}
       else
       {TreeNode temp = right.pop();getright(right,temp.left);}
       }
       return false;
    } 
}
// class Solution {
//     public boolean find(TreeNode root, int k) {
//         if(root==null)
//         return false;
//         if(root.val==k)
//         return true;
//         if(root.val>k)
//         return find(root.left,k);
//         return find(root.right,k);
//     }
//     public boolean find1(TreeNode root, int k, TreeNode root1) {

//         if(root==null)
//         return false;
//         if(root.val!=k-root.val && find(root1,k-root.val))
//         return true;
//         return(find1(root.left,k,root1)||find1(root.right,k,root1));
//     }

//     public boolean findTarget(TreeNode root, int k) {
//        return find1(root,k,root);
//     }
// }