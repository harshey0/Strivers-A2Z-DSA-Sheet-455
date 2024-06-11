import java.util.ArrayList;
public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
      
        int left=0,right=0;
        if(n<m)
        return -1;
           for(int x=0;x<n;x++)
            {
                right+=arr.get(x);
            }
        while(left<=right)
        {
            int mid= (right+left)/2;
            int c=1;int s=0;int a=0;
           
            for(int x=0;x<n;x++)
            {
                if(s+arr.get(x)>mid)
                {
                    s=arr.get(x);
                    c++;
                }
                else s+=arr.get(x);
                a=Math.max(a,s);
            }
            if(c>m || a>mid)
            left=mid+1;
            else
            right = mid-1;
        }
        return left;

    }
}