class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(right>=left)
        {
            char p = s.charAt(left);
            char q = s.charAt(right);
            if((int)p<48 || ((int)p>57 && (int)p<97) ||(int)p>122 )
            left++;
            else if((int)q<48 || ((int)q>57 && (int)q<97) ||(int)q>122 )
            right--;
            else if(p!=q)
            return false;
            else {left++;right--;}
        }
        return true;
    }
}