class Solution{
    
    public static boolean isPossible(int a, int b){
        // Code here
        if((a==2 || b==2 )&& (a!=2 || b!=2 ))
        return true;
        return false;
    }
}