public class Solution {
    public static boolean check(int n, int k,int []a , int i) {
        // Write your code here
        if(k==0)
        return true;        
        if(i==n)
        return false;
        if(check(n,k-a[i],a,i+1)|| check(n,k,a,i+1))
        return true;
        return false;
    }
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        return check(n,k,a,0);
    }
}