class Solution {
    public void rotate(int[] nums, int k) {
k=k%nums.length;
int p=0;
         int arr[] =new int[nums.length];
        for(int i =0;i<nums.length;i++)
              arr[i]=nums[i];
          for (int i = arr.length-k; i < arr.length; i++) {
            nums[p]=arr[i];p++;
        }
        for(int i = 0; i < arr.length-k; i++){
            nums[p]=arr[i];p++;
        }
    }
}