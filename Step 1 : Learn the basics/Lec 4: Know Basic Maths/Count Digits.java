class Solution{
    static int evenlyDivides(int N){
        // code here
        
        int c=0;
        for(int n =N;n!=0;n/=10)
        {
            int d = n%10;
            if (d==0)
            continue;
            if(N%d==0)
            c++;
        }
        return c;
    }
}