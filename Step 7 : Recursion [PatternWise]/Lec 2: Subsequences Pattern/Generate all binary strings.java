import java.util.*;
public class Solution {
    public static void generate(int N , String S ,List<String> list) {
       // Write your code here.
       if(N==0)
       {
           list.add(S);
           return;
       }
       generate(N-1,S+"0",list);
       if(S.length()==0 || S.charAt(S.length()-1)=='0')
       generate(N-1,S+"1",list);
   }

   public static List< String > generateString(int N) {
       // Write your code here.
       List<String> list = new ArrayList();
       generate(N,"",list);
       return list;

   }
}
