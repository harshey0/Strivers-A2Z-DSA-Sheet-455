class Solution {
    private int dia(TreeNode root , int[]d)
    {
        if (root == null)
        return 0;
        int left = dia(root.left , d);
        int right = dia(root.right , d);
        d[0]= Math.max(d[0],left+right);
        return Math.max(left,right)+1;
    }


public int diameterOfBinaryTree(TreeNode root) {
    
    int d[] = new int[1];
    d[0]=0;
    dia(root , d);
    return d[0];
}
}

// class Pair
// {
//    int a1,a2;
//    Pair(int x, int y)
//    {
//        a1=x;a2=y;
//    }
// }

// class Solution {
//        private Pair dia(TreeNode root)
//        {
//            if (root == null)
//            return new Pair(0,0);
//            Pair left = dia(root.left);
//            Pair right = dia(root.right);
//            int c = Math.max(left.a1+right.a1,Math.max(left.a2,right.a2));
//            return new Pair(Math.max(left.a1,right.a1)+1,c);
//        }


//    public int diameterOfBinaryTree(TreeNode root) {

//        return dia(root).a2;
//    }
// }