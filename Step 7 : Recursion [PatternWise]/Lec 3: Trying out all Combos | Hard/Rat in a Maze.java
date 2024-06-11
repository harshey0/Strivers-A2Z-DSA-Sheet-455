class Solution {
    public static void find(int[][] m,int a, int b, int n, ArrayList<String> list , String ans) {
       // Your code here
       if(n-1==a && n-1==b)
       {list.add(ans) ;return;}
       m[a][b]=0;
       if ( a+1<n && m[a+1][b]==1)
       find(m,a+1,b,n,list,ans+"D");
            if ( a>0 && m[a-1][b]==1)
       find(m,a-1,b,n,list,ans+"U");
            if ( b+1<n && m[a][b+1]==1)
       find(m,a,b+1,n,list,ans+"R");
            if ( b>0 && m[a][b-1]==1)
       find(m,a,b-1,n,list,ans+"L");
       m[a][b]=1;
       return;
   }
   public static ArrayList<String> findPath(int[][] m, int n) {
       // Your code here
       ArrayList<String> list = new ArrayList();
       if(m[0][0]==0)
       return list;
       find(m,0,0,n,list,"");
       return list;
       
   }
}