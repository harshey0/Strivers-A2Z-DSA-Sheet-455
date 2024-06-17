import java.util.*;
public class Solution 
{
    public static long connectRopes(int[] arr)
    {
        //Write your code here
        PriorityQueue <Integer> p = new PriorityQueue();

        for(int x=0;x<arr.length;x++)
        {
            p.add(arr[x]);
        }
        int ans=0;
        while(p.size()>1)
        {

            int a= p.remove();
            int b=p.remove();
            p.add(a+b);
            ans+=a+b;
        }
        return ans;
    }
}