class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
           List<Integer> pre= new ArrayList();
        Stack <TreeNode> st = new Stack();
        if(root== null)
        return pre;
        while(!st.isEmpty() || root!=null)
        {
            while(root!=null)
            {
                st.push(root);
                root=root.left;
            }
            while(!st.isEmpty() && root==null)
           { 
            root=st.pop();
            pre.add(root.val);
            root=root.right;
            }
        }
        return pre;
    }
}