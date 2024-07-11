class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });
        int c=0;
        for(int x=1;x<arr.length;x++)
        {
            if(arr[x][0]>arr[c][1])
            {c++;arr[c][0]=arr[x][0];arr[c][1]=arr[x][1];}
            arr[c][1]=Math.max(arr[x][1],arr[c][1]);
        }
        c++;
        int ans[][]= new int [c][2];
        for(int x=0;x<c;x++)
        {
            ans[x][0]=arr[x][0];
            ans[x][1]=arr[x][1];
        }
        return ans;
    }
}