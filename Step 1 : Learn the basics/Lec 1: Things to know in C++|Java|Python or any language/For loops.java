import java.util.*;

public class Solution {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int []a = new int[i+2];
		a[0]=0;
		a[1]=1;
		for(int x=2;x<=i;x++)
		{
			a[x]=a[x-1]+a[x-2];
		}
		System.out.println(a[i]);
	}

}
