// CODESTUDIO 
public class Solution {
    public static int[] moveZeros(int n, int []a) {
    // Write your code here.
    int c2=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i] !=0)
        {
            a[c2]=a[i];
            c2++;
        }
    }
    for(int i=c2;i<a.length;i++)
    {
        a[i]=0;
    }
    return a;
}
}