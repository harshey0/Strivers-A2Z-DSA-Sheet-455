class Solution {
    public int trap(int[] height) {
        Stack<Integer> s = new Stack();
        int min = height[0];
        s.push(min);
        int ans=0;
        for(int x=1;x<height.length;x++)
        {
            if(height[x]<min)
            {
                s.push(height[x]);
                continue;
                }
            while(!s.isEmpty())
            {
                ans+=min-s.pop();
            }
            min=height[x];
            s.push(height[x]);

        System.out.println(ans);
        }
        if(s.isEmpty())
        return ans;
        while(!s.isEmpty() )
        {
            min=s.pop();
            while(!s.isEmpty() && s.peek()<=min)
            {
                ans+=min-s.pop();
            }
            }
            return ans;
    }
}