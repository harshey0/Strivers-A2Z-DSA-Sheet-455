class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left=1,right=0;
            for(int x=0;x<piles.length;x++)
            right=Math.max(right,piles[x]);
        while(left<=right)
        {
            int c=0;
            int  mid=(right+left)/2;
            for(int x=0;x<piles.length;x++)
            c+=Math.ceil(piles[x]/(double)mid);
            if(c<=h)
            right=mid-1;
            else
            left=mid+1;
        }
        return left;
    }
}