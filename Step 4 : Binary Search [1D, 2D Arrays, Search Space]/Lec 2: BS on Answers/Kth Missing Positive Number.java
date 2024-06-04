class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int x,c=arr[0]-1;
        for(x=1;x<arr.length;x++)
        {
            if(k<=c)
            return arr[x-1]-c+k-1;
            c+=arr[x]-arr[x-1]-1;
        }
            if(k<=c)
            return arr[x-1]-c+k-1;
        return arr[x-1]+k-c;
    }
}