class Solution {
    public int minBitFlips(int start, int goal) {
        int c=start^goal;
        int ans=0;
        while(c>0)
        {
            c=c&(c-1);
            ans++;
        }
        return ans;
    }
}