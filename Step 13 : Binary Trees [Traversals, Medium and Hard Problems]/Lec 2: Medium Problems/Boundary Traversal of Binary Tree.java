class Solution
{
    private void left(Node node ,ArrayList<Integer> l )
    {
        if(node==null)
        return;
        l.add(node.data);
        if(node.left!=null)
        left(node.left,l);
        else
        left(node.right,l);
    }
    private void right(Node node ,ArrayList<Integer> r )
    {
        if(node==null)
        return;
        if(node.right!=null)
        right(node.right,r);
        else
        right(node.left,r);
        r.add(node.data);
        
    }
    private void leaf(Node node ,ArrayList<Integer> le )
    {
        if(node==null)
        return;
        if(node.left==null && node.right==null)
        {le.add(node.data);}
        leaf(node.left,le);
        leaf(node.right,le);
    }
    
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> left= new ArrayList();
	    ArrayList<Integer> right= new ArrayList();
	    ArrayList<Integer> leaf= new ArrayList();
	    int p=1;int k=0;int d=0;
	    if(node.left!=null)
	    {left(node,left);k=1;}
	    else
	    left.add(node.data);
	    if(node.right!=null)
	    {right(node,right);d=1;}
	    if(node.right!=null || node.left!=null)
	    {leaf(node,leaf);p=0;}
	    
	    for(int x=k;x<leaf.size()-d;x++)
	    {
	        left.add(leaf.get(x));
	    }
	    for(int x=p;x<right.size()-1;x++)
	    {
	        left.add(right.get(x));
	    }
	    return left;
	}
}