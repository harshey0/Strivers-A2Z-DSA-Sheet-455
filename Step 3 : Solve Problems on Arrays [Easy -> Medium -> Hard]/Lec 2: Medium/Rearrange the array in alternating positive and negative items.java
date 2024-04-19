// CODESTUDIO 
public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int left=0,right=1;
        int c=a.length;
        int b[] = new int [c];
        for (int x=0;x<a.length;x++)
        {
            if(a[x]>=0)
            {
                b[left]=a[x];
            left+=2;
            }
            else
            {
                 b[right]=a[x];
            right+=2;
            }
        //     if(left<c && a[left]<0)
        //     {
        //         while(left<c && a[left]<0)
        //         left++;
        //     }
        //    if(right <c && a[right]>=0)
        //     {
        //         while(right <c && a[right]>=0)
        //         right++;
        //     }
        //     if(x%2==0)
        //    { b[x]=a[left];left++;}
        //     else
        //     {b[x]=a[right];right++;}
        }
        return b;

    }
}