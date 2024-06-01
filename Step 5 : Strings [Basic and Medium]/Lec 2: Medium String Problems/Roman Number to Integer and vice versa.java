class Solution {
    public int romanToInt(String s) {
        HashMap <Character,Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int m=0,ans=0;
        for(int x = s.length()-1;x>=0;x--)
        {
            int d = map.get(s.charAt(x));
            if(d>=m)
            ans+=d;
            else
            ans-=d;
            m= Math.max(d,m);
        }
        return ans;
    }
}

// class Solution {
//     public int romanToInt(String s) {
//         HashMap <Character,Integer> map = new HashMap();
//         map.put('I',1);
//         map.put('V',5);
//         map.put('X',10);
//         map.put('L',50);
//         map.put('C',100);
//         map.put('D',500);
//         map.put('M',1000);
//         int ans=map.get(s.charAt(s.length()-1));
//         for(int x = s.length()-1;x>0;x--)
//         {
//             ;
//             if(map.get(s.charAt(x-1))>=map.get(s.charAt(x)))
//             ans+=map.get(s.charAt(x-1));
//             else
//             ans-=map.get(s.charAt(x-1));
//         }
//         return ans;
//     }
// }
