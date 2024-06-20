class Pair{
    Node temp; int c;
    Pair(Node temp , int c)
    {
        this.temp = temp;
        this.c=c;
    }
}
class Solution {
// Function to return a list of nodes visible from the top view
// from left to right in Binary Tree.

static void top(TreeMap<Integer,Integer> map, Queue<Pair> q  )
{

    while(!q.isEmpty() && q.peek().temp == null)
    {q.remove();}
    if(q.isEmpty())
    {return;}
    if(!map.containsKey(q.peek().c))
        map.put(q.peek().c,q.peek().temp.data);
        q.add(new Pair(q.peek().temp.left,q.peek().c -1));
        q.add(new Pair(q.peek().temp.right,q.peek().c +1));
    
    q.remove();
    top(map ,q );

}
static ArrayList<Integer> topView(Node root) {
    // add your code
    ArrayList<Integer> list = new ArrayList();
    TreeMap<Integer,Integer> map = new TreeMap();
    Queue<Pair> q = new LinkedList<>();
    if(root==null)
    return list;
    q.add(new Pair(root,0));
    top(map, q);
    
    for (int value : map.values())
    list.add(value);
    return list;
}
}