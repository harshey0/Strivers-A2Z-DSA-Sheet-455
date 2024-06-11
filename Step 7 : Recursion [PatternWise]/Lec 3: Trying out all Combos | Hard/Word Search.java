class Solution {
    public boolean check(char[][] board, String word , int r , int c) {

        if(word.length()==0)
        return true;
        boolean ans1=false,ans2=false,ans3=false,ans4=false;

                    char p =board[r][c];
                    board[r][c]='0';
        if(r<board.length-1 && board[r+1][c]==word.charAt(0))
        {
            ans1= check(board,word.substring(1),r+1,c);
            }
        if(r>0 && board[r-1][c]==word.charAt(0))
        {
            ans2= check(board,word.substring(1),r-1,c);
            }
        if(c<board[0].length-1 && board[r][c+1]==word.charAt(0))
        {
            ans3 = check(board,word.substring(1),r,c+1);
            }
        if(c>0 && board[r][c-1]==word.charAt(0))
        {
           ans4= check(board,word.substring(1),r,c-1);
            }
            board[r][c]=p;
            return ans1||ans2||ans3||ans4;
        
    }
    public boolean exist(char[][] board, String word) {
        
        for(int x=0;x<board.length;x++)
        {
            for(int y=0;y<board[0].length;y++)
            {
                if(board[x][y]==word.charAt(0))
                {
                    if(check(board,word.substring(1),x,y))
                return true;
                }
            }
        }
        return false;
    }
}