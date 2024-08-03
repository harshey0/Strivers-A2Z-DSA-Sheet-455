class Pair
{
   TreeNode a;
   int b;
   Pair(TreeNode a, int b)
   {
       this.a=a;
       this.b=b;
   }
}
class Solution {
   public int widthOfBinaryTree(TreeNode root) {
       int ans=0;
       Queue<Pair> q = new LinkedList();
       q.add(new Pair(root,0));
           int d=0;
       while(!q.isEmpty())
       {
           int n = q.size();
           int max=0;
           int min=0;
           for(int x=0;x<n ;x++)
           {
               Pair temp = q.remove();
               if(x==0)
               min=temp.b;
               if(x==n-1)
               max=temp.b;
               if(temp.a.left!=null)
               q.add(new Pair(temp.a.left,temp.b*2 +1));
               if(temp.a.right!=null)
               q.add(new Pair(temp.a.right,temp.b*2 +2));
           }
           ans=Math.max(max-min+1,ans);
       }
       return ans;
   }
}