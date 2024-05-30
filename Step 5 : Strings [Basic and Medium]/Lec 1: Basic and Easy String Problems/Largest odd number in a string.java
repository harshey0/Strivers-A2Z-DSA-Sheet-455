class Solution {
    public String largestOddNumber(String num) {
        for(int x=num.length()-1;x>=0;x--)
        {
            if(num.charAt(x)%2==1)
            {
                return num.substring(0,x+1);
            }
        }
        return "";
    }
}