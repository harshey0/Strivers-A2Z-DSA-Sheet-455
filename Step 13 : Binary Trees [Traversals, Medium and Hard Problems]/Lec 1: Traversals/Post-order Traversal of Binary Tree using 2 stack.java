class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> pre= new ArrayList();
        Stack <TreeNode> st = new Stack();
        Stack <Integer> st2 = new Stack();
        if(root== null)
        return pre;
        st.push(root);
        while(!st.isEmpty())
        {
            root=st.pop();
            st2.push(root.val);
            if(root.left!=null)
            st.push(root.left);
            if(root.right!=null)
            st.push(root.right);
        }
        while(!st2.isEmpty())
        pre.add(st2.pop());
        return pre;
    }
}