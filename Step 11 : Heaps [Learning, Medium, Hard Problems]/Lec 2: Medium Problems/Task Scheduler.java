class Solution {
    public int leastInterval(char[] tasks, int k) {
        PriorityQueue<Integer>pq1= new PriorityQueue(Comparator.reverseOrder());
        PriorityQueue<Integer>pq2= new PriorityQueue();
        int n= tasks.length;
        for(int x=0;x<n;x++)
        {
            pq2.add((int)tasks[x]);
        }
        int c=1;
        for(int x=0;x<n-1;x++)
        {
            int d = pq2.remove();
            if(pq2.peek()==d)
            c++;
            else
            {
                pq1.add(c);
                c=1;
            }
        }
        pq1.add(c);
        pq2.clear();
        c=0;
        k++;
        while(!pq1.isEmpty())
        {
        n=pq1.size();
        int p=k;
        if(n<k)
        {p=n;c+=k-n;}
        for(int x=0;x<p;x++)
        {
            pq2.add(pq1.remove()-1);
        }
        for(int x=0;x<p;x++)
       { int l=pq2.remove();
            if(l!=0)
        pq1.add(l);}
        }
        return c+tasks.length-k+n;
        
    }
}