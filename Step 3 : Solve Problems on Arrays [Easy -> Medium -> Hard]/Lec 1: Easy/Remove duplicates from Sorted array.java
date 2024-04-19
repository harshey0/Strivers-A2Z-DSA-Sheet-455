// CODESTUDIO 
public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[c])
            {c++;arr[c]=arr[i];}
                
        }
        return c+1;
    }
}