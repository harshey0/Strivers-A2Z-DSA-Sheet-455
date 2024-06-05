class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        if(((1<<k)&n) == 0)
        return false;
        else return true;
    }
    
}