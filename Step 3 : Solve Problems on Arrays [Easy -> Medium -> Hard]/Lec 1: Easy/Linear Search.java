// CODESTUDIO 
import java.util.*;
public class Solution {
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        for(int x=0;x<n;x++)
        {
            if(arr[x]==num)
            return x;
        }
        return -1;
    }
}