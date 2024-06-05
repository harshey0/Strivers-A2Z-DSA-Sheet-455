class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,max=0;
        HashMap<Character,Integer> map = new HashMap();
        for(int x=0;x<s.length();x++)
        {
            if(map.containsKey(s.charAt(x)))
           left=Math.max(map.get(s.charAt(x))+1,left);
            map.put(s.charAt(x),x);
            max=Math.max(max,x-left+1);
        }
        return max;
    }
}