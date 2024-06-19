class Tree {
    // Function to return the ceil of given number in BST.
    int find(Node root, int key , int c)
    {
        if (root == null) return c;
        // Code here
        if(root.data == key)
        return key;
        else if(root.data<key)
        return find(root.right,key,c);
        else
        return find(root.left,key,root.data);
    }
    int findCeil(Node root, int key) {
        // Code here
        if(root == null)
        return -1;
        return find(root,key ,-1 );
    }
}