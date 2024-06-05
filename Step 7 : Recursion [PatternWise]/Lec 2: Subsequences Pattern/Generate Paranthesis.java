class Solution {
    void generate(int n , String S ,List<String> list , int c) {
     // Write your code here.
     if(n==0 && c==0)
     {
         list.add(S);
         return;
     }
      if(n>0)
     generate(n-1,S+"(",list,c+1);
     if(c>0)
     generate(n,S+")",list,c-1);
 }

  public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
     generate(n,"",list,0);
     return list;
  }
}