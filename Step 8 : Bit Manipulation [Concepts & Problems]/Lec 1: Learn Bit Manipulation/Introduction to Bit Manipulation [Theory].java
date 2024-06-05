class Solution {
    static void bitManipulation(int num, int i) {
        // code here
         if(((1<<i-1)&num) == 0)
         System.out.print("0"+" "+((1<<i-1)|num)+" "+((~(1<<i-1))&num));
         else
         System.out.print("1"+" "+(((1<<i-1)|num))+" "+((~(1<<i-1))&num));
    }
}