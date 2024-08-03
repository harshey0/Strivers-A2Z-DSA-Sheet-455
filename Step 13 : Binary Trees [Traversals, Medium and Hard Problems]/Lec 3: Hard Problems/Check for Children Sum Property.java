class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static boolean check(Node root)
    {
        if(root==null || (root.left==null && root.right==null))
        return true;
        if(root.left==null)
        return (check(root.right) && root.right.data==root.data);
        else if(root.right==null)
        return (check(root.left) && root.left.data==root.data);
        else
        return (check(root.left) && check(root.right) && root.left.data + root.right.data==root.data);
    }
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(root==null || check(root))
        return 1;
        return 0;
        
    }
}