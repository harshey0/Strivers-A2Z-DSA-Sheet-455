class Solution {

    public boolean check(char[][] board , int x, int y, char p) {

           boolean ans=true;
           for(int i=0;i<9;i++)
           {if(board[x][i]==p)
           ans=false;}

           for(int i=0;i<9;i++)
           {if(board[i][y]==p)
           ans=false;}

           for(int i=0;i<3;i++)
           for(int z=0;z<3;z++)
           {
               if(board[i+3*(x/3)][z+3*(y/3)]==p)
               ans=false;
           }
           return ans;
}
public void solveSudoku(char[][] board) {
   if(solve(board))
   return;
}


public boolean solve(char[][] board) {

   int c=0;
    for(int x=0;x<9;x++)
   {
       for(int y=0;y<9;y++)
       {
           if(board[x][y]=='.')
           c++;
       }
   }
   if(c==0)
   return true;
   
   for(int x=0;x<9;x++)
   {
       for(int y=0;y<9;y++)
       {
           if(board[x][y]=='.')
           {
               for(char p='1';p<='9';p++)
          { 
           if(check(board,x,y,p))
           {
               board[x][y]=p;
               if(!solve(board))
               board[x][y]='.';
           }
           }
           }
           if(board[x][y]=='.')
           return false;
       }
   }
   return true;

}
}