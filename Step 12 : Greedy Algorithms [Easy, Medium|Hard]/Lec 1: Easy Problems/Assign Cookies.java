class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;int y=0;
        for(int x=0;x<g.length;x++)
        {
            while(y<s.length && s[y]<g[x])
            {
                y++;
            }
            if(y==s.length)
            break;
            c++;y++;
        }
        return c;
    }
}