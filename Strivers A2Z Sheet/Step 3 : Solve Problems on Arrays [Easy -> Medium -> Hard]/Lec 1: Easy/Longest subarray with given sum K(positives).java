// CODESTUDIO 


// public class Solution {
//     public static int longestSubarrayWithSumK(int []a, long k) {
//         // Write your code here
//          int answ=0;
//         for (int i =0;i<a.length;i++)
//         {
//             int s=0;
//             for (int y=i;y<a.length;y++)
//             {
                 
//                 s+=a[y];
//                 if(s==k)
//                 {
//                     answ= Math.max(answ,(y-i+1));
                   
//                 }
//                 if(s>k)
//                 break;
//             }
//         }
//         return answ;
//     }
// }

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
         int left=0,answ=0;
        
            long s=0;
            for (int y=0;y<a.length;y++)
            {
                  s+=a[y];
                 while(s>k&& left<=y)
                 {
                     s-=a[left];
                     left++;
                 }
            
                if(s==k)
                {
                    answ= Math.max(answ,(y-left+1));
                   
                }
              
             
        }
        return answ;
    }
}