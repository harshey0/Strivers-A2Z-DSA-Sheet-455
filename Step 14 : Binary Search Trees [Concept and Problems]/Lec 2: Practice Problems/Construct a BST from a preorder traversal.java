class Solution {

    private void build(TreeNode head , int p)
    {
        if(head.val>p)
        {
            if(head.left != null)
        build(head.left,p);
        else
        {
            head.left=new TreeNode(p);
            return;
        }
        }
        else{
            if(head.right != null)
        build(head.right,p);
        else
        {
            head.right=new TreeNode(p);
            return;
        }
        }
    }

    public TreeNode bstFromPreorder(int[] p) {
        TreeNode head = new TreeNode(p[0]);
        int c=1;
        while(p.length!=c)
        {
            build(head,p[c]);
            c++;
        }
        return head;
    }
}