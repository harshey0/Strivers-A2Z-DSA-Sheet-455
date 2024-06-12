public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> node= new HashSet();
        while(headA!=null)
        {
            node.add(headA);
            headA=headA.next;
        }
          while(headB!=null)
        {
            if(node.contains(headB))
            return headB;
            headB=headB.next;
        }
        return null;
    }
}