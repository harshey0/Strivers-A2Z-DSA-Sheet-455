class Solution {
    public int[][] insert(int[][] arr, int[] ne) {

        int n=arr.length;
         Arrays.sort(arr,Comparator.comparingDouble(o->o[0]));
        int c=-1;int d=-1;
        
        for(int x=0;x<n;x++)
        {
            if(arr[x][1]>=ne[0] && c==-1)
            {c=x;d=x;}
            if(arr[x][0]<=ne[1])
            d=x;
        }
            if(c==-1)
           { 
            int ans[][]= new int [n+1][2];
         for(int x=0;x<n;x++)
        {
        ans[x][0]=arr[x][0];
        ans[x][1]=arr[x][1];
        }
            ans[n][0]=ne[0];
            ans[n][1]=ne[1];
            return ans;
            }
        int ans[][];
        if(ne[1]>=arr[d][0])
         ans= new int [n-d+c][2];
        else
        ans= new int [n-d+c+1][2];
        for(int x=0;x<c;x++)
        {
            ans[x][0]=arr[x][0];
            ans[x][1]=arr[x][1];
        }
        ans[c][0]=Math.min(arr[c][0],ne[0]);
        if(ne[1]>=arr[d][0])
        ans[c][1]=Math.max(arr[d][1],ne[1]);
        else
        {ans[c][1]=ne[1];d--;}
        for(int x=d+1;x<n;x++)
        {
            ans[c+x-d][0]=arr[x][0];
            ans[c+x-d][1]=arr[x][1];
        }
        return ans;
    }
}