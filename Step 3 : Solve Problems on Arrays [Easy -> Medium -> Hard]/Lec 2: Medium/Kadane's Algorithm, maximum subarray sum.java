// CODESTUDIO 
import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
			long s=0,ans=0;

			for(int x=0;x<n;x++)
			{
				s+=arr[x];
				ans=Math.max(ans,s);
				if(s<0)
				s=0;
			}
			return ans;

	}

}
