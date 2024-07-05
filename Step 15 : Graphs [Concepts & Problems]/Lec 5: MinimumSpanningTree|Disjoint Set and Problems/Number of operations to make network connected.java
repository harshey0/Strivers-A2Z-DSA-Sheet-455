class Solution {
    int find(int[]A,int X)
       {
         //add code here.
         if(A[X]!=X)
         A[X]= find(A,A[X]);
         return A[X];
   }
    void unionSet(int[]A,int X,int Z)
       {
        //add code here.
        int a = find(A,X);
        int b = find(A,Z);
        A[a]=b;
   }
   public int makeConnected(int n, int[][] edges) {
       
       int A[]= new int [n];
       for(int x=0;x<n;x++)
       A[x]=x;
       int c=0;
       int d=0;
       for(int x=0;x<edges.length;x++)
       {
           int a = find(A,edges[x][0]);
           int b = find(A,edges[x][1]);
           if(a==b)
           c++;
           else
           unionSet(A,a,b);
       }
       for(int x=0;x<n;x++)
       {
           if(A[x]==x)
           d++;
       }
       d--;
       if(d<=c)
       return d;
       else return -1;
   }
}