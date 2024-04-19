// CODESTUDIO 
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int max=0,sum=0;
		int n=nums.length;
		HashMap <Integer,Integer> map= new HashMap<>();
		for(int x=0;x<n;x++)
		{
			sum=sum+nums[x];
			int remain = sum-k;
			if(sum == k)
			max=Math.max(max,x+1);
			
			if(map.containsKey(remain))
			{
				int len = x-map.get(remain);
				max=Math.max(max,len);
			}
			if(!map.containsKey(sum))
			map.put(sum,x);
		}
		return max;
	}
}