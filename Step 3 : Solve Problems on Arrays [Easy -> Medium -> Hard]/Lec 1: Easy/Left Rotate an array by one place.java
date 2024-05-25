public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int c=arr[0];
        for(int x=0;x<n-1;x++)
        arr[x]=arr[x+1];
        arr[n-1]=c;
        return arr;
    }
}