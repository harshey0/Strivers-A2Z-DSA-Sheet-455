class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue <TreeNode> q = new LinkedList();
        List<List<Integer>> ans = new ArrayList();
        if(root!=null)
        q.add(root);
        int p=0;int l;
        while(!q.isEmpty())
        {

        List<Integer> list = new ArrayList();
        int n = q.size();
        for(int x=0;x<n;x++)
        {
            TreeNode temp = q.remove();
            System.out.println(temp.val);
            if(p%2==0)
            list.add(temp.val);
            else
            list.add(0,temp.val);
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
        }
        p++;
        ans.add(list);
        }
        return ans;
    }
}