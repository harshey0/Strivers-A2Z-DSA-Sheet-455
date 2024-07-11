class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = m+n-1; j >=0; j--) {
            if(n!=0 && (m==0 || nums2[n-1]>nums1[m-1]))
            {nums1[j] = nums2[n-1];n--;}
            else
            {nums1[j] = nums1[m-1];m--;}
        }
    }
}