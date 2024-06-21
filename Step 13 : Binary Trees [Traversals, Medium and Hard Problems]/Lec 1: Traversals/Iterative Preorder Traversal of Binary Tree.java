class Solution {

public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> pre= new ArrayList();
    Stack <TreeNode> st = new Stack();
    if(root== null)
    return pre;
    st.push(root);
    while(!st.isEmpty())
    {
        root=st.pop();
        pre.add(root.val);
        if(root.right!=null)
        st.push(root.right);
        if(root.left!=null)
        st.push(root.left);

    }
    return pre;
}
}