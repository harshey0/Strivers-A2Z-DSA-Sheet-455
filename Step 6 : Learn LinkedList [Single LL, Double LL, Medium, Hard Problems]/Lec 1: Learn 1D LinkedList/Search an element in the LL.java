class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        for(int x=0;x<n;x++)
        {
            if(head.data == key)
            return true;
            head=head.next;
        }
        return false;
    }
}