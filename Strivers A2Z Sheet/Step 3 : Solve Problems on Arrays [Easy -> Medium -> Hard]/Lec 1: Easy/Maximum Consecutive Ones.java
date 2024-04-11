public class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
        for(int i=n;i>m+1;i--)
        {
            for(int x=0;x<n+1-i;x++)
            {
                int c=0;
                for(int y=x;y<x+i;y++)
                {
                    if(vehicle[y]==0)
                    c++;
                }
                if(c<=m)
                return i;
            }
        }
        return m;
    }
}