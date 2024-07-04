class GfG
{
	  int find(int[]A,int X)
        {
          //add code here.
          if(A[X]!=X)
          A[X]= find(A,A[X]);
          return A[X];
	}
	 void unionSet(int[]A,int X,int Z)
        {
         //add code here.
         int a = find(A,X);
         int b = find(A,Z);
         A[a]=b;
	}
}