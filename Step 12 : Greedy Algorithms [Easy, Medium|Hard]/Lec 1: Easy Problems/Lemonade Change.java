class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=0,b=0;
        for(int x=0;x<bills.length;x++)
        {
            int z=bills[x];
           if(z==20)
           {
            if(b<1 || a<1)
            {
                if(a<3)
                return false;
                a-=3;
            }
            else
            {b--;a--;}
           }
           else if(z==10)
           {
            if(a<1)
            return false;
            a--;b++;
           }
           else
           a++;
           System.out.println(a+" "+b);
        }
        return true;
    }
}