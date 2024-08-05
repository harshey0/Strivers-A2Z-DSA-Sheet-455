class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        // pre[0]=null;
        // suc[0]=null;
        suc[0]=null;
        pre[0]=null;
        while (root != null && root.data != key) {
            if (key < root.data) {
                suc[0] = root;
                root = root.left;
            } else {
                pre[0] = root; 
                root = root.right;
            }
        }
          if (root == null) {
          return;
        }
        Node temp=root;
        if(temp.left != null)
        {
            temp=temp.left;
            while(temp.right!=null)
            temp=temp.right;
            pre[0]=temp;
        }
        if(root.right!=null)
        {
            root=root.right;
            while(root.left!=null)
            root=root.left;
            suc[0]=root;
        }
        return;
    }
}