class Solution {
    Node constructDLL(int arr[]) {
        // Code here
            Node temp= new Node(arr[0]);
        Node head= temp;
        for(int x=1;x<arr.length;x++)
        {
            Node prev= temp;
            temp=new Node(arr[x]);
            prev.next=temp;
            temp.prev=prev;
        }
        return head;
    }
}