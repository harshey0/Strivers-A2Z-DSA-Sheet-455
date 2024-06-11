class Solution {
    
    static Node constructLL(int arr[]) {
        // code here
        Node temp = new Node(arr[0]);
        Node Head = temp;
        for(int x=1;x<arr.length;x++)
        {
            Node prev = temp;
            temp = new Node(arr[x]);
            prev.next= temp;
        }
        return Head;
        
    }
}