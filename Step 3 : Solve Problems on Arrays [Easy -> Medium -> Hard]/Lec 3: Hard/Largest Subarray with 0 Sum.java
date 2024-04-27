// CODESTUDIO 

import java.util.*;
public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap <Integer,Integer> map = new HashMap<>();
        int s=0,c=0;
        for(int x=0;x<arr.length;x++)
        {
            s+=arr[x];
            int rem = s;
            if(s==0)
            c= Math.max(c,x+1);
            else if(map.containsKey(rem))
            c=Math.max(c,x-map.get(rem));
            else map.put(s,x);
        }
        return c;
    }
}