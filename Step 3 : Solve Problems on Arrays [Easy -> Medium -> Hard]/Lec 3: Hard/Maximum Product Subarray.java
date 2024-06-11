class Solution {
    public int maxProduct(int[] nums) {
        double min = Integer.MIN_VALUE;
        if(nums.length==1)
        return nums[0];
        double c1=1,c2=1;
        for(int x=0;x<nums.length;x++)
        {
            if(c1==0)
            c1=1;
            if(c2==0)
            c2=1;
            c1*=nums[x];
            c2*=nums[nums.length-1-x];
            min=Math.max(min,Math.max(c1,c2));
            
            }
        return (int)min;
        
    }
}

// class Solution {
//     public int maxProduct(int[] nums) {
//         double min = Integer.MIN_VALUE;
//         int left=0;double p=1, c1=1,c2=1;
//         for(int x=0;x<nums.length;x++)
//         {
//             if(c1>0)
//             c1*=nums[x];
//             if(nums[x]<0)
//             c2=1;
//             if(nums[x]==0)
//             {
//                 if(p<0 && x-left !=1)
//                 {min=Math.max(min,p/c1);
//                 min=Math.max(min,p/c2);}
//                 min=Math.max(min,0);
//                 c1=1;c2=1;left=x+1;
//                 p=1;}
//             else
//            { p*=nums[x];
//             min=Math.max(p,min);}
//             c2*=nums[x];
//         }
//         System.out.println(min);
//         if(p<0 && left !=nums.length-1)
//        { min=Math.max(min,p/c1);
//         min=Math.max(min,p/c2);}
//         System.out.println(min);
//         return (int)min;
        
//     }
// }