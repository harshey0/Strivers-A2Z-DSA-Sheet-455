class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        int floor,ceil;
        int left=0;int right= n-1;
        while(left<=right)
        {
            int mid=(right+left)/2;
            if(x==arr[mid])
            {
                right=mid;left=mid;break;
            }
            else if(x>arr[mid])
            left=mid+1;
            else
            right=mid-1;
        }
        if(right==-1)
        floor=-1;
        else floor= arr[right];
        if(left==n)
        ceil=-1;
        else ceil = arr[left];
        return new Pair(floor, ceil);
        
    }
}