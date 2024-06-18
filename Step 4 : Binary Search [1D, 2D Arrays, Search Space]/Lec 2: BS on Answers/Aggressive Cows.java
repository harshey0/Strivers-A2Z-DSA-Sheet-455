import java.util.*;
public class Solution {
    public static int aggressiveCows(int []arr, int m) {
        //    Write your code here.
        
     int n= arr.length;
         int left=0,right=0;
        if(n<m)
        return -1;
        Arrays.sort(arr);
        right= arr[n-1]-arr[0];
        while(left<=right)
        {
            int mid= (right+left)/2;
            int c=1;int p=0;
            for(int x=1;x<n;x++)
            {
                if(arr[x]-arr[p]>=mid)
                {c++;p=x;}
            }

            if(c<m)
            right=mid-1;
            else
            left=mid+1;
        }
        return right;

    }
}