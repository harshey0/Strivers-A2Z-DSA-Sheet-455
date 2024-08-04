class Solution {
    
    public static void solve(String a , HashSet<String> set, int n ,int i,String ans) {
// Write your code her
       if(i==n)
       {set.add(ans);return;}
       solve(a,set,n,i+1,ans+a.charAt(i));
       solve(a,set,n,i+1,ans);
    }
public static String betterString(String a, String b) {
    // Code here
    HashSet<String> set1=new HashSet();
    HashSet<String> set2=new HashSet();
int n = a.length();
int m = b.length();
  solve(a,set1,n,0,"");
  solve(b,set2,m,0,"");
   if(set1.size()>=set2.size())
   return a;
   else
   return b;
}
}