class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    public static void dist (Node root, int target, int dist[], int val) 
    {
        // Your code goes here
        if(root==null)
        return;
        if(root.data==target)
        {
            dist[1]=1;
            return;
        }
        dist[0]=Math.max(dist[0],val+1);
         dist(root.left,target,dist , val+1);
        dist(root.right,target,dist , val+1);
        
    }
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        int max=0;
        while(root.data!=target)
        {
        int right[]={0,0};
        int left[]={0,0};
        dist(root.left,target,left , 0);
        dist(root.right,target,right , 0);
        if(left[1]==0)
        {root=root.right;max=Math.max(max,left[0]);}
        else
        {root=root.left;max=Math.max(max,right[0]);}
            max++;
        }
        int right[]={0,0};
        int left[]={0,0};
        dist(root.left,target,left , 0);
        dist(root.right,target,right , 0);
        return Math.max(max,Math.max(right[0],left[0]));
    }
}