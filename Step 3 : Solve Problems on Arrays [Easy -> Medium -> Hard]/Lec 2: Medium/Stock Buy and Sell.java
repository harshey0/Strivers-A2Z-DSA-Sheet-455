// CODESTUDIO 

public class Solution {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int ans=0;
        int min=prices[0];

        for(int x=1;x<prices.length;x++)
        {
            min=Math.min(min,prices[x]);
            ans=Math.max((prices[x]-min),ans);

        }
        return ans;

    }
}
