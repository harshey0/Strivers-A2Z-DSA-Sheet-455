// CODESTUDIO 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int answ = arr[0];
    for (int i =1;i<n;i++)
    {
        if(arr[i]>answ)
        answ=arr[i];
    }
    return answ;

    }
}