class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        int n=a.length;
        int m = a[0].length;
        int l=0; int l1=1;
        List<Integer> list= new ArrayList();
        while(n>l || m >l)
        {
            if(l<n)
            for(int x=l;x<m;x++)
           list.add(a[l][x]);
            if(l<m)
           for(int y=l1;y<n-1;y++)
           list.add(a[y][m-1]);
           if(n-l>1)
           for(int x=m-1;x>=l;x--)
           list.add(a[n-1][x]);
           if(m-l>1)
           for(int x=n-2;x>=l1;x--)
           list.add(a[x][l]);
           n--;m--;l++;l1++;
        }
        return list;
    }
}