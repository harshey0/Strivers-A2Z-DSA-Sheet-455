import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		int ans=num;
		int length = (int)Math.log10(num)+1;
		int s=0;
		while(num!=0)
		{
			int d = num%10;
			s+=Math.pow(d,length);
			num/=10;
		}
		if(ans==s)
		return true;
		else return false;
	}
}
