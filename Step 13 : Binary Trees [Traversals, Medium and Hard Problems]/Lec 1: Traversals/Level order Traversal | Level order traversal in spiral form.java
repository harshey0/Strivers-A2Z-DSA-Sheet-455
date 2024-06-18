class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList();
        List<List<Integer>> ans = new ArrayList();
        if(root!=null)
        q.add(root);
        while(!q.isEmpty())
        {

        List<Integer> list = new ArrayList();
        int n = q.size();
        for(int x=0;x<n;x++)
        {
            TreeNode temp = q.remove();
            System.out.println(temp.val);
            list.add(temp.val);
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
        }
        ans.add(list);
        }
        return ans;
    }
}