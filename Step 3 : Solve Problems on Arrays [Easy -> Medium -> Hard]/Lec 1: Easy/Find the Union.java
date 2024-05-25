class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
         int c=0,d=0;
        ArrayList< Integer > sorted = new ArrayList<>();
        for(int x=0;x<n+m;x++)
        {
            if(c<n&&(d==m||(arr1[c]<arr2[d])))
            {
            if(sorted.isEmpty() ||sorted.get(sorted.size()-1)!=arr1[c])
                sorted.add(arr1[c]);
            c++;}
            else if(c==n||(arr1[c]>arr2[d]))
            {
                
            if(sorted.isEmpty() ||sorted.get(sorted.size()-1)!=arr2[d])
            sorted.add(arr2[d]);
            d++;}
            else
            {
            if(sorted.isEmpty() ||sorted.get(sorted.size()-1)!=arr1[c])
            sorted.add(arr2[d]);
            d++;c++;x++;}
        }
        return sorted;
    }
}