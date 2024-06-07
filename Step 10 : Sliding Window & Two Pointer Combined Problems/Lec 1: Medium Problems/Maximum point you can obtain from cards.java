class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0,p=k-1;
        for(int i=0;i<k;i++)
        {
            sum+=cardPoints[i];
        }
        int max=sum;
        for(int i=n-1;i>n-k-1;i--)
        {
            sum+=cardPoints[i]-cardPoints[p--];
            max=Math.max(sum,max);
        }
        return max;
    }
}