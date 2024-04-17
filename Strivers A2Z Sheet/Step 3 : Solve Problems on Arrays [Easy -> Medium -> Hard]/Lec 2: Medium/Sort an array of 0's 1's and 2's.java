import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);

        for(int x : arr)
        {
            map.put(x, map.get(x) + 1);
        }
        arr.clear();
        
            for(int x=0;x<3;x++)
            {
                for(int y=0;y<map.get(x);y++)
                arr.add(x);
            }

        
    }
}