class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int x=0;x<first.length();x++)
        {
            if(first.charAt(x)!=last.charAt(x))
            return first.substring(0,x);
        }
        return first;
    }
}