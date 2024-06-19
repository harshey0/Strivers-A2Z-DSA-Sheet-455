class Solution {
    
    public void find(Node root , ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list)
    {
        if(root.left==null && root.right == null)
        {list.add(root.data);ans.add(list);return;}
        list.add(root.data);
        if(root.left!=null)
        find(root.left , ans , new ArrayList(list));
        if(root.right!=null)
        find(root.right , ans ,new ArrayList(list));
        
    }
    
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        ArrayList<Integer> list = new ArrayList();
        if(root==null)
        return ans;
        find(root , ans , list);
        return ans;
    }
}