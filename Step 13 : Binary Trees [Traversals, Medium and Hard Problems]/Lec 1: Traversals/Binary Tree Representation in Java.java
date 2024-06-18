class Solution{
    public static void createTree(Node root, ArrayList<Integer> v ){
        // Code here
        
        Queue<Node> q = new LinkedList();
        q.add(root);
        v.remove(0);
        while(!v.isEmpty())
        {
            Node left=new Node(v.get(0));
            v.remove(0);
            Node right = new Node(v.get(0));
            v.remove(0);
            Node temp = q.remove();
            temp.left=left;
            temp.right=right;
            q.add(left);
            q.add(right);
        }
    }
}