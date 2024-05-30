class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap <Character,Integer> map1 = new HashMap ();
        for(int x =0;x<s.length();x++)
        {
            map1.put(s.charAt(x),1+map1.getOrDefault(s.charAt(x),0));
            map1.put(t.charAt(x),map1.getOrDefault(t.charAt(x),0)-1);
        }
        for(Map.Entry<Character,Integer> entry :map1.entrySet())
        {
            if(entry.getValue()!=0)
            return false;
        }
        return true;
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//      if (s.length() != t.length())
//       return false;
 
//     int[] freq = new int[26];
//     for (int i = 0; i < s.length(); i++) {
//       freq[s.charAt(i) - 'a']++;
//       freq[t.charAt(i) - 'a']--;
//     }
//     for (int i = 0; i < 26; i++) {
//       if (freq[i] != 0)
//         return false;
//     }
//     return true;
//     }
// }