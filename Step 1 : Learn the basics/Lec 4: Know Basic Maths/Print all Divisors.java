class Solution{
    static long sumOfDivisors(int N){
        // code here
        long totalSum = 0;
        for (int d = 1; d <= N; d++) {
            totalSum += d * (N / d);
        }
        return totalSum;
    }
}