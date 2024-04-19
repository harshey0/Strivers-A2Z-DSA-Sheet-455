// CODESTUDIO 
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int max =0,c=1;
        for (int x=0;x<a.length;x++)
        {
            for (int y=a.length-1;y>x;y--)
            {
                if(a[y]<a[y-1])
                {
                    int temp = a[y];
                    a[y]=a[y-1];
                    a[y-1]=temp;
                }
            }
        }
        for (int x =1;x<a.length;x++)
        {
            if(a[x-1]==a[x])
            continue;
          if(a[x-1]+1==a[x])
          c++;
          else
          c=1;
          max = Math.max(max,c);
        }
        return max;
    }
}