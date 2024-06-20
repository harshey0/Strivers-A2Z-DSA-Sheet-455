class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList();
        for(int x=2;x*x<=N;x++)
        {
            if(N%x==0)
            ans.add(x);
            while(N%x==0)
            N/=x;
        }
        if(N>1)
        ans.add(N);
        int a[]= new int[ans.size()];
        for(int x=0;x<ans.size();x++)
        {
            a[x]=ans.get(x);
        }
        return a;
    }
}