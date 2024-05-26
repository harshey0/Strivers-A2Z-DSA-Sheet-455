import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
 int []ans = new int[2];
        int left=0;int right= n-1;
        while(left<=right)
        {
            int mid=(right+left)/2;
            if(x==a[mid])
            {
                right=mid;left=mid;break;
            }
            else if(x>a[mid])
            left=mid+1;
            else
            right=mid-1;
        }
        if(right==-1)
        ans[0]=-1;
        else ans[0]= a[right];
        if(left==n)
        ans[1]=-1;
        else ans[1] = a[left];
        return ans;
    }
}