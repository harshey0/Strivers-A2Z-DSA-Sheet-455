class Solution {
    public int characterReplacement(String s, int k) {
        
        int max=0,left=0,ans=0;
        HashMap<Character,Integer> map = new HashMap();
        for(int x=0;x<s.length();x++)
        {
         map.put(s.charAt(x),1+map.getOrDefault(s.charAt(x),0));
         max=Math.max(max,map.get(s.charAt(x)));
         if(max+k>=x-left+1)
         ans=Math.max(x-left+1,ans);
         else
         {
            map.put(s.charAt(left),map.get(s.charAt(left))-1);
            left++;
         }
        }
        return ans;
    }
}