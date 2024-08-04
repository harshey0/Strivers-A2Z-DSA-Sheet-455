class Pair{
    TreeNode node; int col;
    Pair(TreeNode temp , int col)
    {
        this.node = temp;
        this.col=col;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map = new TreeMap();
        List<List<Integer>> ans = new ArrayList();
         Queue<Pair> q = new LinkedList<>();
            if(root==null)
        return ans;
        q.add(new Pair(root,0));
        int row=0;
       while(!q.isEmpty())
       {
            int n = q.size();
            for(int x=0;x<n;x++)
            {
                Pair temp=q.remove();
                if(!map.containsKey(temp.col))
                map.put(temp.col,new TreeMap<>());
                if(!map.get(temp.col).containsKey(row))
                map.get(temp.col).put(row,new ArrayList<>());
                map.get(temp.col).get(row).add(temp.node.val);
                if(temp.node.left!=null)
                q.add(new Pair(temp.node.left,temp.col-1));
                if(temp.node.right!=null)
                q.add(new Pair(temp.node.right,temp.col+1));
            }
            row++;
       }
        for (Integer col : map.keySet()) {
            ArrayList<Integer> val=new ArrayList();
             for (Integer ro : map.get(col).keySet()) {

                ArrayList<Integer> list= new ArrayList(map.get(col).get(ro));
                Collections.sort(list);
                for(int x=0;x<list.size();x++)
                {
                    val.add(list.get(x));
                }
        }
        ans.add(val);
        }
        return ans;
    }
}