class Solution
{
    public static void solve(Node temp , int a[])
    {
        if(temp==null)
        return;
        solve(temp.next,a);
        if(a[0]==0)
        return;
        if(temp.data!=9)
        {temp.data+=1;a[0]=0;}
        else
        temp.data=0;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        int a[]={1};
       solve(head,a);
       if(a[0]==1)
       {Node temp = new Node(1);temp.next=head;return temp;}
       return head;
    }
}