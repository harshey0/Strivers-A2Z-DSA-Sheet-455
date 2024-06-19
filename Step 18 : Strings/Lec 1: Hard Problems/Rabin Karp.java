class Solution {

    private boolean check(String a, String b , int c)
    {
        if(a.substring(c,c+b.length()).equals(b))
        return true;
        else
        return false;
    }

    private boolean rabin(String a, String b)
    {
        int hash =0;int c=0;
        for(int x=0;x<b.length();x++)
        {
            hash=(hash+(((int)b.charAt(x)-97)*(int)(Math.pow(26,b.length()-x-1)%97)))%97;
        }
        for(int x=0;x<b.length();x++)
        {
            c=(c+(((int)a.charAt(x)-97)*(int)(Math.pow(26,b.length()-x-1)%97)))%97;
        }
        if(c==hash && check(a,b,0))
        return true;
        for(int x=b.length();x<a.length();x++)
        {
            c=(c*26);
            c=(c+((int)a.charAt(x)-97));
            c=(c-((int)a.charAt(x-b.length())-97)*(int)(Math.pow(26,b.length())%97 ))%97;
            if(c<0)
            c+=97;
            if(c==hash && check(a,b,x-b.length()+1))
            return true;
        }
        return false;
    }

    public int repeatedStringMatch(String a, String b) {
        StringBuilder s = new StringBuilder(a);
        int x=1;
      while(s.length()<b.length())
      {
        s.append(a);
        x++;
      }
      if(rabin(s.toString(),b))
      return x;
      s.append(a);
      if(rabin(s.toString(),b))
      return x+1;
      return -1;
    }
}