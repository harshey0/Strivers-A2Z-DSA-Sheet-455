// CODESTUDIO 

public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        for(int i =0;i<n;i++)
        {
            int c=book[i];
            for(int y=i+1;y<n;y++)
            {
                if(c+book[y]==target)
                return "YES";
            }
        }
        return "NO";
    }
}