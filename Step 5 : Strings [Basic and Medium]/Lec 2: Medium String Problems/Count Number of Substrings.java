class Solution
{
    long substrCount (String S, int K) {
        // your code here=
        HashMap <Character,Integer> map = new HashMap();
        HashSet <Character> set = new HashSet();
        long c=0; int left=0;
        
        for(int x=0;x<S.length();x++)
        {
            map.put(S.charAt(x),1+map.getOrDefault(S.charAt(x),0));
            set.add(S.charAt(x));
            if(set.size()==K)
            c++;
            while(set.size()>K && left<=x)
            {
                map.put(S.charAt(left),map.get(S.charAt(left))-1);
                if(map.get(S.charAt(left))==0)
                {set.remove(S.charAt(left));c++;}
                left++;
            }
            int f=left,d=0;
            while((f<x && d==0) && set.size()==K )
            {
                if(S.substring(f+1,x+1).contains(String.valueOf(S.charAt(f))))
                c++;
                else d++;
                f++;
            }
        }
        return c;
        
    }
}