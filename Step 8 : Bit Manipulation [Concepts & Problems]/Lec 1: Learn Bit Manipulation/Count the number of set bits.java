class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        int c=0,i=0;
        int p=n;
        while(p !=0)
        {
          int r= ((n+1)%((int)Math.pow(2,i+1)));
          c+=((n+1)/(int)Math.pow(2,i+1))*(int)Math.pow(2,i) ;
          if(r>((int)Math.pow(2,i)))
        {  
        c+= r-((int)Math.pow(2,i));              
        }
           p=p>>1; i++;
        }
        return c;
    }
}