class Solution {
    public static String compareNM(int n, int m) {
        // code here
        String ans="";
        if(m>n)
        ans="lesser";
        else if (n>m)
        ans="greater";
        else ans="equal";
    
    return ans;}
}