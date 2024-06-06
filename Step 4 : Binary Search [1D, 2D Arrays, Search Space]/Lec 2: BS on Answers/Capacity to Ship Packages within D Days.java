class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0,right=0;
        for(int x=0;x<weights.length;x++)
        {
            if(weights[x]>left)
            left=weights[x];
            right+=weights[x];
        }
        while(left<=right)
        {
            int mid = (left+right)/2;
                int s=0,c=1;
            for(int x=0;x<weights.length;x++)
            {
                s+=weights[x];
                if(s>mid)
                {
                    c++;
                    s=weights[x];
                }
            }
            if(c>days)
            left=mid+1;
            else
            right=mid-1;
        }
        return left;
    }
}