// CODESTUDIO 

public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int b[] = new int[2];
        HashMap <Integer,Integer> map = new HashMap <>();
        for (int ar : a)
        map.put(ar,(map.getOrDefault(ar,0)+1));
        for(int ar=1;ar<=a.length;ar++)
        {
        if(!(map.containsKey(ar)))
        b[1]=ar;
        else if (map.get(ar)==2)
        b[0]=ar;}
        return b;
        
    }
}
