import java.util.*;

public class Solution {
    private static List<Integer> preorder(TreeNode root ,List<Integer> list)
    {
            if(root==null)
            return list;
            list.add(root.data);
            preorder(root.left , list);
            preorder(root.right , list);
            return list;
    }

    private static List<Integer> postorder(TreeNode root ,List<Integer> list)
    {
            if(root==null)
            return list;
            postorder(root.left , list);
            postorder(root.right , list);
            list.add(root.data);
            return list;
    }

    private static List<Integer> inorder(TreeNode root ,List<Integer> list)
    {
            if(root==null)
            return list;
            inorder(root.left , list);
            list.add(root.data);
            inorder(root.right , list);
            return list;
    }


    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        List<Integer> pre= new ArrayList();
        List<Integer> post= new ArrayList();
        List<Integer> in= new ArrayList();
        List<List<Integer>> ans= new ArrayList();
        ans.add(inorder(root,in));
        ans.add(preorder(root,pre));
        ans.add(postorder(root,post));
        return ans;
    }
}