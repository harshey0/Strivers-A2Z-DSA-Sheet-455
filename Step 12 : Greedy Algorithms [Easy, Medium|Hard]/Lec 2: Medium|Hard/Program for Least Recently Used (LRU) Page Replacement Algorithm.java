class Solution{
    static int pageFaults(int n, int C, int arr[]){
        // code here
        Queue<Integer> q = new LinkedList();
        int ans=0;
        for(int x=0;x<n;x++)
        {
            if(q.contains(arr[x]))
           { q.remove(arr[x]);
           q.add(arr[x]);
            continue;}
            ans++;
            if(q.size()==C)
            q.remove();
            q.add(arr[x]);
        }
        return ans;
    }
}