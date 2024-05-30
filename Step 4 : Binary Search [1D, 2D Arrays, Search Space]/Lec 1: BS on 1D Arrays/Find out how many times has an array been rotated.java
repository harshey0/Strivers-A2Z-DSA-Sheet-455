class Solution {
    int findKRotation(int arr[], int n) {
        // code here
       int left = 0, right = n - 1;
        while(left < right) {
            int mid =(right + left) / 2;

            if(arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}