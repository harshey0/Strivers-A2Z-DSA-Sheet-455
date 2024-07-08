import java.util.* ;
import java.io.*; 

class Solution {
  static class Trie
  {
    Trie[] children;
    boolean eow;
    Trie()
    {
      children= new Trie[26];
        eow = false;
      for(int x=0;x<26;x++)
      {
        children[x]=null;
      }
    }
  }
  private static Trie root;
  private static void insert(String a)
  {
    Trie temp = root;
      for(int x=0;x<a.length();x++)
      {
        if(temp.children[a.charAt(x)-'a']==null)
        temp.children[a.charAt(x)-'a']= new Trie();
        temp=temp.children[a.charAt(x)-'a'];
      }
        temp.eow = true;
  }

  public static String completeString(int n, String[] a) {
    // Write your code here.
    root=new Trie();
    for(int x=0;x<n;x++)
    {
      insert(a[x]);
    }
      StringBuilder ans = new StringBuilder("None");
      int max=0;
      for(int x=0;x<n;x++)
      {
        StringBuilder temp = new StringBuilder("");
        String check = a[x];
        Trie t = root;
        int c=0;
        for(int i=0;i<check.length();i++)
        {
          if(t.children[check.charAt(i)-'a'].eow==false)
          break;
          t=t.children[check.charAt(i)-'a'];
          c++;
          temp.append(check.charAt(i));
        }
        if(c<max || c==0)
        continue;
        if(c==max && ans.toString().compareTo(temp.toString())<0)
        continue;
        max=c;
        ans=temp;
      }
      return ans.toString();
  }
}