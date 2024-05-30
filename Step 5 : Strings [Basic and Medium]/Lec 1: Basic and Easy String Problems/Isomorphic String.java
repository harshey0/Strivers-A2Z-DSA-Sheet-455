class Solution {
    public boolean isIsomorphic(String s, String t) {

if(s.length()!=t.length())
return false;
HashMap <Character,Character> map = new HashMap();
HashMap <Character,Character> map2 = new HashMap();
        for(int x= 0 ; x<s.length();x++)
        { 
            char r = s.charAt(x);
            char r1 = t.charAt(x);
            if(map.getOrDefault(r,r1)!=r1 || map2.getOrDefault(r1,r)!=r)
            return false;
            map.put(r,r1);
            map2.put(r1,r);
        }
        return true;
    }
}