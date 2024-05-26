class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long a = A;
        Long b = B;
        Long ans[]= new Long[2];
        while(a>0 && b>0)
        {
            if(b>a)
            b%=a;
            else
            a%=b;
        }
        if(a>0)
        ans[1]=a;
        else
        ans[1]=b;
        
        ans[0]=(A*B)/ans[1];
        return ans;
    }
};