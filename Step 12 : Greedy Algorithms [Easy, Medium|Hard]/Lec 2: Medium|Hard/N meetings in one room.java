class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        int arr[][] = new int [n][3];
        
        for(int x=0;x<n;x++)
        {
            arr[x][0]=x;
            arr[x][1]=start[x];
            arr[x][2]=end[x];
        }
        Arrays.sort(arr,Comparator.comparingDouble(o->o[2]));
        int c=1;int d=arr[0][2];
        
        for(int x=1;x<n;x++)
        {
            if(arr[x][1]>d)
            {c++;d=arr[x][2];}
        }
        return c;
    }
}