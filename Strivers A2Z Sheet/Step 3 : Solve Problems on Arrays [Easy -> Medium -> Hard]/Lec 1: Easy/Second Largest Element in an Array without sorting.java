// CODESTUDIO 
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
   
    int l=a[0],sl=a[0],s=a[0],ss=a[0];
    for (int i=1;i<n;i++)
    {
        if(a[i]>l)
        {
            sl=l;
            l=a[i];
        }
  

        if(a[i]<s)
        {
            ss=s;
            s=a[i];
        }
 
        }

        if(sl==l||ss==s)
        {
            if(sl==l)
            {
                sl=a[1];
                 for (int i=2;i<n;i++)
     {
              if(a[i]>sl)
              {
                  sl=a[i];
              }
                     }

        }

if(ss==s)
            {
              ss=a[1];
                 for (int i=2;i<n;i++)
     {
              if(a[i]<ss)
              {
                  ss=a[i];
              }
                     }

       
    }}
     int answ[] ={sl , ss};
        return answ;
    }
}