class BSTIterator {
    int p ;
    ArrayList<Integer> inorder ;

    public void inorder(TreeNode root, ArrayList<Integer> list)
    {
        if(root==null)
        return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }

    public BSTIterator(TreeNode root) {
         p = 0;
        inorder = new ArrayList();
        inorder.add(Integer.MIN_VALUE);
        inorder(root,inorder);
    }
    
    public int next() {
        return inorder.get(++p);
    }
    
    public boolean hasNext() {
        if(p<inorder.size()-1)
        return true;
        return false;
    }
}

// class BSTIterator {
//     int p ;
//     Stack<TreeNode> inorder ;

//     public void inorder(TreeNode root, Stack<TreeNode> list)
//     {
//         if(root==null)
//         return;
//         list.add(root);
//         inorder(root.left,list);
//     }

//     public BSTIterator(TreeNode root) {
//         inorder = new Stack();
//         inorder.add(new TreeNode(Integer.MIN_VALUE));
//         inorder(root,inorder);
//     }
    
//     public int next() {
//         int val=inorder.peek().val;
//         inorder(inorder.pop().right,inorder);
//         return val;
//     }
    
//     public boolean hasNext() {
//         if(inorder.size()>1 || inorder.peek().left!=null)
//         return true;
//         return false;
//     }
// }