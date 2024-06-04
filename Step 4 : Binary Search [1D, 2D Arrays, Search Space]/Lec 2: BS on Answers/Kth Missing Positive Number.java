class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int left=0,right=arr.length-1;
        if(k<arr[0])
        return k;
        while(left<=right)
        {
            int mid =(left+right)/2;
            int c= arr[mid]-mid-1;
            if(c>=k)
            right=mid-1;
            else
            left=mid+1;
        }
        return right+k+1;
    }
}