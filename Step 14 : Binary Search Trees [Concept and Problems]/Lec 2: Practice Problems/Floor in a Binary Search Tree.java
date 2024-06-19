class Solution {
    private static int find(Node root, int key , int c)
   {
       if (root == null) return c;
       // Code here
       if(root.data == key)
       return key;
       else if(root.data>key)
       return find(root.left,key,c);
       else
       return find(root.right,key,root.data);
   }
   
   public static int floor(Node root, int key) {
       // Code here
        if(root == null)
       return -1;
       return find(root,key ,-1 );
   }
}