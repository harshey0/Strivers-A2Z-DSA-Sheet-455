// CODESTUDIO 
import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int n= a.length;
        int m= b.length;
        int c=0,d=0;
        List< Integer > sorted = new ArrayList<>();
        for(int x=0;x<n+m;x++)
        {
            if(c<n&&(d==m||a[c]<b[d]))
            {
                if(sorted.isEmpty() || sorted.get(sorted.size() - 1)!=a[c])
                sorted.add(a[c]);
            c++;}
            else if(c==n||a[c]>b[d])
            {if(sorted.isEmpty() || sorted.get(sorted.size() - 1)!=b[d])
            sorted.add(b[d]);
            d++;}
            else
            {if(sorted.isEmpty() || sorted.get(sorted.size() - 1)!=a[c])
            sorted.add(b[d]);
            d++;}
        }
        return sorted;
    }
}
