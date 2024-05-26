class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";int min=999999;
        for(int x=0;x<strs.length;x++)
        {
            min = Math.min(strs[x].length(),min);
        }
        for(int x=0;x<min;x++)
        {
            char c=strs[0].charAt(x);
            for(int y=0;y<strs.length;y++)
            if(c!=strs[y].charAt(x))
            return ans;
            ans+=c;
        }
        return ans;
    }
}