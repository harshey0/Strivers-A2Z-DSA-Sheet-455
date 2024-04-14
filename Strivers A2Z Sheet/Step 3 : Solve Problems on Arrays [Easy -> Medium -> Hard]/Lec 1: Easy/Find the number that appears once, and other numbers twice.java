// CODESTUDIO 
import java.util.*;
public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : arr) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
            if (entry.getValue() == 1)
            return entry.getKey();
            return 0;
    }
}