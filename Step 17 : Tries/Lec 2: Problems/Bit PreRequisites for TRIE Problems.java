class Solution {
  
    public int XOR(int n, int m)
    { 
        // Code here
        return n^m;
    }
    public int check(int a, int b) {
        // Code here
        if((b&(1<<(a-1)))==0)
        return 0;
        else return 1;
    }
    public int setBit(int c, int d) {
        // Code here
        return (d|(1<<c));
    }
}