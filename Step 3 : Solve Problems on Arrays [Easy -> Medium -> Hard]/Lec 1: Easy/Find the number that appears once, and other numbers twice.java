class Solution {
    public int singleNumber(int[] nums) {
          HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            int value = map.getOrDefault(key, 0);
            map.put(key, value + 1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
            if (entry.getValue() == 1)
            return entry.getKey();
            return 0;
    }
    
}