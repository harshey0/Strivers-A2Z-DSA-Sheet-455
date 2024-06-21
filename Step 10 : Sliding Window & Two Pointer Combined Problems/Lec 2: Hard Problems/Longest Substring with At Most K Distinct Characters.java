import java.util.*;
public class Solution {

	public static int kDistinctChars(int k, String str) {
		// Write your code here
		int max=0;
		int c=0;
		HashMap <Character,Integer> set = new HashMap();

		for(int x=0;x<str.length();x++)
		{
			set.put(str.charAt(x),1+set.getOrDefault(str.charAt(x),0));
				while(set.size()>k)
				{
				set.put(str.charAt(c),set.getOrDefault(str.charAt(c),0)-1);
				if(set.get(str.charAt(c))==0)
				set.remove(str.charAt(c));
				c++;
				}
			if(x+1-c > max)
			max=x+1-c;
		}
		return max;
	}

}