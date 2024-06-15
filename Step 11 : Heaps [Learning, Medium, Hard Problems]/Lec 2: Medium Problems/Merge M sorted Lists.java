class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode a, ListNode b) {
                return Integer.compare(a.val, b.val);
            }
        };
        PriorityQueue<ListNode>pq = new PriorityQueue(comparator);

        for(int x=0;x<lists.length;x++)
        {
            ListNode temp= lists[x];
            while(temp!=null)
            {
                pq.add(temp);
                temp=temp.next;
            }
        }
        if(pq.isEmpty())
        return null;
        ListNode head = pq.remove();
        ListNode temp=head;
          while(!pq.isEmpty())
          {
            temp.next=pq.remove();
            temp=temp.next;
          }
          temp.next=null;
          return head;
    }
}