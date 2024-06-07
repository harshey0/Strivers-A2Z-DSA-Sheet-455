class Solution
{
    public int[] twoOddNum(int arr[], int n)
    {
        // code here
        int s=0;
        for(int x=0;x<arr.length;x++)
        s^=arr[x];
        
        int c= s&(~(s-1));
        
        int y=0,z=0;
        for(int x=0;x<arr.length;x++)
        {if((c&arr[x])==0)
        y^=arr[x];
        else
        z^=arr[x];
        }
        return new int[]{Math.max(y, z), Math.min(z, y)};
    }
}

// class Solution
// {
//     public int[] twoOddNum(int arr[], int n)
//     {
//         // code here
//         HashSet<Integer> set = new HashSet<>();
        
//         for(int x=n-1;x>=0;x--)
//         {
//             int s = set.size();
//             set.add(arr[x]);
//             if(set.size()==s)
//             set.remove(arr[x]);
//         }
//         Integer[] array = set.toArray(new Integer[0]);
//         if(array[1]> array[0])
//         return new int[]{array[1], array[0]};
//         else
//         return new int[]{array[0], array[1]};
//     }
// }