class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList <Integer> list = new ArrayList();
        int max=0;
        for(int x=arr.length-1;x>-1;x--)
        {
            if(arr[x]>=max)
            {
                max=arr[x];
                list.add(0,max);
            }
        }
        return list;
    }
}