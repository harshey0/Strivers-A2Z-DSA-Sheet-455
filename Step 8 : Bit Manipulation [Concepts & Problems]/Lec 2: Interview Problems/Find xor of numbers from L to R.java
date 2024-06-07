class Solution {
    
    public static int x(int a)
    {
        int c=a%4;
        if(c==0)
        return a;
        if(c==1)
        return 1;
        if(c==3)
        return 0;
        else
        return a+1;
    }
    
    
    public static int findXOR(int l, int r) {
        
        return x(l-1)^x(r);
        
    }
}