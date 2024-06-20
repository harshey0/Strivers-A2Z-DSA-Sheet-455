class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList();
        int p=0;
        for(int x=1;x*x<=n;x++)
        {
            if(n%x==0)
            {
                list.add(p,x);
                if(x!=n/x)
                list.add(list.size()-p,n/x);
                p++;
            }
        }
        for(int x=0;x<list.size();x++)
        {
            System.out.print(list.get(x)+" ");
        }
    }
}