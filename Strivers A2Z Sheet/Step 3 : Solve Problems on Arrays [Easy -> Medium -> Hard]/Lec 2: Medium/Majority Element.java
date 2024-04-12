// CODESTUDIO 
import java.util.*;
public class Solution {
    public static int majorityElement(int[] v) {
        int freq = v.length / 2;
        HashMap<Integer, Integer> mpp = new HashMap<>();
           for (int num : v) {
            int value = mpp.getOrDefault(num, 0);
            mpp.put(num, value + 1);
        }

       for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (v.length / 2)) {
                return it.getKey();
            }
        }
          
        
        return -1; 
    }
}