class Solution {

    private boolean check(int a, int b, int n ,List<String> list )
    {
        for(int x=0;x<n;x++)
        {
            if(list.get(a).charAt(x)=='Q' || list.get(x).charAt(b)=='Q')
            return false;
        }
        for(int x=0;a-x>=0 && b-x>=0;x++)
        {
            if(list.get(a-x).charAt(b-x)=='Q')
            return false;
        }
        for(int x=0;a-x>=0 && b+x<n;x++)
        {
            if(list.get(a-x).charAt(b+x)=='Q')
            return false;
        }
        return true;
    }

    private void solve(List<String> list,List<List<String>> ans , int n , int i)
    {
        if(i==n)
        for(int x=0;x<n;x++)
        {
            int c=0;
            for(int y=0;y<n;y++)
             {if(list.get(x).charAt(y)=='Q')
             c++; }
        if(c==0)
        break;
        if(x==n-1)
        {ans.add(new ArrayList(list));
        return;}
        }
            for(int y=0;y<n;y++)
            {
                if(check(i,y,n,list))
                {
                   StringBuilder sb= new StringBuilder(list.get(i)); 
                   sb.setCharAt(y,'Q');
                list.set(i,sb.toString());
                solve(list,ans,n, i+1);
                sb.setCharAt(y,'.');
                list.set(i,sb.toString());
                }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        StringBuilder sb= new StringBuilder();

            for(int y=0;y<n;y++)
            sb.append('.');
            for(int y=0;y<n;y++)
            list.add(sb.toString());
        solve(list , ans , n , 0);
        return ans;
    }
}