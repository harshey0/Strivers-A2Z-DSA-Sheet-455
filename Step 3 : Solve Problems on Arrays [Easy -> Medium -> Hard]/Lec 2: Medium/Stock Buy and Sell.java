class Solution {
    public int maxProfit(int[] prices) {
        
        int min=prices[0],ans=0;
        for(int x=1;x<prices.length;x++)
        {
            ans=Math.max(ans,prices[x]-min);
            min=Math.min(min,prices[x]);
        }
        return ans;
    }
}