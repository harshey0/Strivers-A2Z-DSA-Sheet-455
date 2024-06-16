class Solution {
    public int eraseOverlapIntervals(int[][] arr) {

        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        int c=1;int d=arr[0][1];
        
        for(int x=1;x<arr.length;x++)
        {
            if(arr[x][0]>=d)
            {c++;d=arr[x][1];}
        }
        return arr.length-c;
    }
}