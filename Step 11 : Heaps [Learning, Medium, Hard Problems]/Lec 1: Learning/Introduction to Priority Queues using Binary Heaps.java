class Solution {
  public int extractMax() {
        // your code here
        GFG obj=new GFG();
        int r = obj.H[0];
        obj.H[0]=obj.H[obj.s];
        obj.H[obj.s]=r;
        obj.s--;
        obj.shiftDown(0);
        return r;
    }
};