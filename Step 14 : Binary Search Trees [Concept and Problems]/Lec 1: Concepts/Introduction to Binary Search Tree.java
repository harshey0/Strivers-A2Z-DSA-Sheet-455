class Solution {
    static boolean isBSTTraversal(int arr[]) {
        // code here
        for(int x=1;x<arr.length;x++)
        if(arr[x]<=arr[x-1])
        return false;
        return true;
    }
}