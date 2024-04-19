// CODESTUDIO 
import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        ArrayList <Integer> ans = new ArrayList<>() ;

        int max=a[a.length-1]-1;

        for (int x=a.length-1;x>=0;x--)
        {
            if(a[x]>max)
           { ans.add(a[x]);max=a[x];}
          
        }
        return ans;
    }
}