class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> pre= new ArrayList();
        Stack <TreeNode> st = new Stack();
        if(root== null)
        return pre;
        st.push(root);
        while(!st.isEmpty())
        {
            root=st.pop();
            pre.add(root.val);
            if(root.left!=null)
            st.push(root.left);
            if(root.right!=null)
            st.push(root.right);

        }
        Collections.reverse(pre);
        return pre;
    }
}

// class Solution {

//     public List<Integer> postorderTraversal(TreeNode root) {

//            List<Integer> pre= new ArrayList();
//         Stack <TreeNode> st = new Stack();
//         TreeNode flag=null;
//         if(root== null)
//         return pre;
//         while(!st.isEmpty() || root!=null)
//         {
//             if(root!=null)
//             {
//                 st.push(root);
//                 root=root.left;
//             }
//             else
//             {
//             root=st.peek();
//             if(!st.isEmpty() && (root.right==null || root.right==flag))
//            { 
//             pre.add(root.val);
//             st.pop();
//             flag=root;
//             root=null;
//             }
//             else
//             root=root.right;
//             }}
//             return pre; 
//     }
// }