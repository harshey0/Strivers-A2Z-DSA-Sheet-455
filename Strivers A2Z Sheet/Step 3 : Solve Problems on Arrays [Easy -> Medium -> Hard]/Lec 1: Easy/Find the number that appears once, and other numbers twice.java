// CODESTUDIO 
import java.util.*;
public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : arr) {
            map.put(key, 0);
        }
        for( int key :arr)
        {
            map.put(key, map.get(key) + 1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
            if (entry.getValue() == 1)
            return entry.getKey();
            return 0;
    }
}