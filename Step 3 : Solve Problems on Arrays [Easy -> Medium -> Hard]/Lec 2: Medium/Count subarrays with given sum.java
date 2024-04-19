// CODESTUDIO 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.    
        int left=0;int sum=0,c=0;
        for(int x=0;x<arr.length;x++)
        {
            sum+=arr[x];
            
            if(sum>s)
            {
                while(sum>s && left<arr.length)
                {
                    sum-=arr[left];
                    left++;
                }
            }
            if(sum==s)
            c++;
          
        }
          return c;
    }
}