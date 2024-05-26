class Solution{
    
    
    static ArrayList<Long> factorial(int a ,long ans, long n ,ArrayList<Long>list )
    {
        if(a*ans>n)
        return list;
        list.add(a*ans);
        factorial(a+1,a*ans,n,list);
        return list;
    }
    
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList <Long> list= new ArrayList();
        ArrayList<Long>li=factorial(1,1,N,list);
        return li;
    }
}