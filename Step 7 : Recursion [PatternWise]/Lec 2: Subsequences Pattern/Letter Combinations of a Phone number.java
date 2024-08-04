class Solution {
    public char [] combo (char a)
    {
        switch(a)
        {
            case '2':
            {
                return new char[]{'a','b','c'};
            }
            case '3':
            {
                return new char[]{'d','e','f'};
            }
            case '4':
            {
                return new char[]{'g','h','i'};
            }
            case '5':
            {
                return new char[]{'j','k','l'};
            }
            case '6':
            {
                return new char[]{'m','n','o'};
            }
            case '7':
            {
                return new char[]{'p','q','r','s'};
            }
            case '8':
            {
                return new char[]{'t','u','v'};
            }
            case '9':
            {
                return new char[]{'w','x','y','z'};
            }
            default : return new char[]{};
        }
    }
    public void solve(String a , int n , List<String> ans , int i, String b) {
        if(i==n)
        {
            if(i!=0)
            ans.add(b);
            return;
        }

        char []c = combo(a.charAt(i));
        for(int x=0;x<c.length;x++)
        {
            solve(a,n,ans,i+1,b+c[x]);
        }
    }
    public List<String> letterCombinations(String a) {
        List<String> ans = new ArrayList();
        solve(a,a.length(),ans,0,"");
        return ans;
    }
}