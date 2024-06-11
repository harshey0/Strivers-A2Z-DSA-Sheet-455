class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        //Code here
        int c=0;
        if(head==null)
        return c;
        while(head!=null)
        {
            c++;
            head = head.next;
        }
        return c;
    }
}