class Solution {
    class Trie
  {
    Trie[] children;
    Trie()
    {
      children= new Trie[2];
    }
  }
  private Trie root;
  private void insert(int a)
  {
    Trie temp = root;
      for(int x=31;x>=0;x--)
      {
        int c=1;
        if((a&(1<<x))==0)
        c=0;
        if(temp.children[c]==null)
        temp.children[c]= new Trie();
        temp=temp.children[c];
      }
  }
    public int findMaximumXOR(int[] nums) {
        
        root = new Trie();
        for(int x : nums)
          insert(x);
          int ans=0;
          
          for(int a : nums)
          {
            int temp=0;
            Trie root1 = root;
          for(int x=31;x>=0;x--)
          {
            temp<<=1;
            int c=1;
              if((a&(1<<x))==0)
              c=0;
           if(root1.children[1-c]!=null)
           {    temp|=1;
               root1 = root1.children[1-c];}
               else
            root1 = root1.children[c];
          }
          ans=Math.max(ans,temp);
          }
          return ans;
    }
}