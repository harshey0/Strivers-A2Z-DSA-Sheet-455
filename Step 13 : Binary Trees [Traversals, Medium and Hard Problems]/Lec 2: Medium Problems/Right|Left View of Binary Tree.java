class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        if(root == null)
        return ans;
        q.add(root);

        while(!q.isEmpty())
        {
            int n = q.size();
            for(int x=0;x<n;x++)
            {
                TreeNode temp=q.remove();
                if(x==n-1)
                ans.add(temp.val);
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
        }
        return ans;
    }
}