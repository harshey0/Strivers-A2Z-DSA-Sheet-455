class Solution{
    static List<Integer> get(int a,int b)
    {
        // code here
        a=a^b;
        b=a^b;
        a=a^b;
        return new ArrayList<>(Arrays.asList(a,b)); 
    }
}