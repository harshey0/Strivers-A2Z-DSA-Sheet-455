class Solution {
    public TreeNode findMin(TreeNode root)
    {
        if(root.left.left == null)
        return root;
        return findMin(root.left);
    }

    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null)
        return root;
        if(root.left==null && root.right == null && root.val == key)
        return null;
        if(root.right == null && root.val == key)
        return root.left;
        if(root.left == null && root.val == key)
        return root.right;
        int c=0;
        TreeNode temp=root;
        TreeNode parent=null;

        while(temp!= null && temp.val!=key)
        {
            parent=temp;
            if(temp.val<key)
            {c=1;temp=temp.right;}
            else
            {c=0;temp=temp.left;}
        }
        if(temp==null)
        return root;
        if(temp.right == null && temp.left == null)
        {
            if(c==0)
            parent.left=null;
            else
            parent.right=null;
            return root;
        }
        if(temp.right==null)
        {
            if(c==0)
            parent.left=temp.left;
            else
            parent.right=temp.left;
            return root;
        }
        if(temp.left==null)
        {
            if(c==0)
            parent.left=temp.right;
            else
            parent.right=temp.right;
            return root;
        }
        if(temp.right.left==null)
        {temp.val=temp.right.val;temp.right=temp.right.right;}
        else
        {parent = findMin(temp.right);
        temp.val = parent.left.val;
        parent.left=parent.left.right;}
        return root;
    }
}