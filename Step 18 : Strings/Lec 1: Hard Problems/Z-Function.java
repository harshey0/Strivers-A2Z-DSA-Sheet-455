class Solution {
    public int strStr(String a, String b) {
        
        for(int x=0;x<=a.length()-b.length();x++)
        {
            if(a.charAt(x)==b.charAt(0))
            {
                if(a.substring(x,x+b.length()).equals(b))
                return x;
            }
        }
        return -1;
    }
}