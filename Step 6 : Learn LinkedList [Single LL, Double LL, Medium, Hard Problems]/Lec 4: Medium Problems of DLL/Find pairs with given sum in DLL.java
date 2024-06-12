class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans= new ArrayList();
        if(head==null || head.next==null)
        return ans;
        Node tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
         while(head.data<tail.data)
        {
          if(head.data+tail.data==target)
            {
        ArrayList<Integer> list = new ArrayList();
        list.add(head.data);
        list.add(tail.data);
        ans.add(list);
           head=head.next;
            tail=tail.prev;
            }
            else if(tail.data+head.data<target)
           head=head.next;
           else
            tail=tail.prev;
            }
        return ans;
    }
}