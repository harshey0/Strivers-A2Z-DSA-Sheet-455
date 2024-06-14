class Node{
    int data; int key; Node next; Node prev;
    public Node(int d , int k)
    {
        key=k;
        data= d;
        next=null;
        prev=null;
    }
}
class LRUCache {
    int cap;
    HashMap<Integer,Node> map;
        Node head;
        Node tail;
    public LRUCache(int capacity) {
        cap=capacity;
        map=new HashMap();
        head=null;
        tail=null;
    }
    
    public int get(int key) {
        int val=-1;
        if(map.containsKey(key))
        val = fun(map.get(key));
        return val;
    }
    
    public void put(int key, int value) {
        if(map.isEmpty())
        {
            map.put(key,insert(value,key));
            return;
        }
        if(map.containsKey(key))
        {map.get(key).data=value;fun(map.get(key));return;}
        if(cap==map.size())
        {map.remove(head.key);head=head.next;}
        map.put(key,insert(value,key));
            return;
    }

    public Node insert(int value , int key) {
        Node temp = new Node(value , key);
            if(head==null||tail==null)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                tail.next=temp;
                temp.prev=tail;
                tail=temp;
            }
            return tail;
    }

    public int fun(Node p)
    {
        if(p==tail)
        return tail.data;
        if(head==p)
        head=head.next;
        if(p.prev != null)
        p.prev.next=p.next;
        if(p.next != null)
        p.next.prev=p.prev;

        p.next=null;
        tail.next=p;
        p.prev=tail;
        tail=p;
        return tail.data;
    } 
}


// class LRUCache {
//     int cap;
//     Queue <Integer> q;
//     HashMap<Integer,Integer>map;
//     public LRUCache(int capacity) {
//         cap = capacity;
//         q=new LinkedList();
//         map= new HashMap();
//     }
    
//     public int get(int key) {
//         if(map.containsKey(key))
//         {
//             q.remove(key);
//         q.add(key);return map.get(key);}
//         return -1;
//     }
    
//     public void put(int key, int value) {
//         if(map.containsKey(key))
//         q.remove(key);
//         if(q.size()==cap)
//         {map.remove(q.remove());}
//         q.add(key);
//         map.put(key,value);
//     }
// }