import java.util.ArrayList;

public class Solution 
{
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

	public static int countDistinctSubstrings(String s) 
	{
		//	  Write your code here.
		 root=new Trie();
		 int ans=1;
    for(int x=0;x<s.length();x++)
    {
		Trie temp = root;
			int c=x;
			while(c<s.length() && temp.children[s.charAt(c)-'a']!= null)
			{
				temp=temp.children[s.charAt(c)-'a'];
				c++;
			}
			insert(s.substring(x,s.length()));
			ans+=s.length()-c;
    }
	return ans;
	}
}