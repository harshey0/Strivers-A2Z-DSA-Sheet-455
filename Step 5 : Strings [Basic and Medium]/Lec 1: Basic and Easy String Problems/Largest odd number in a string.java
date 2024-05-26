class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        for(int x=0;x<num.length();x++)
        {
            int c=num.charAt(x);
            if(c%2==1)
            {
                ans=num.substring(0,x+1);
            }
        }
        return ans;
    }
}