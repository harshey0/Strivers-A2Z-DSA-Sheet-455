class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        double p=0;
        Arrays.sort(arr,(a,b)->{ 
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2, r1);
            
        });
        for(int x=0;x<n;x++)
        {
            if(arr[x].weight<w)
            {p+=arr[x].value;w-=arr[x].weight;}
            else
            {
                p+=(w*arr[x].value)/(double)arr[x].weight;break;
            }
        }
        return p;
    }
}