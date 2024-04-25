// CODESTUDIO 

import java.util.*;
public class Solution {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        ArrayList<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = v.length;
        for (int x=0;x<n;x++)
        {
            map.put(v[x],map.getOrDefault(v[x],0)+1);
            if(map.get(v[x])==((n/3)+1))
            {ans.add(v[x]);}
        }
        return ans;
    }
}