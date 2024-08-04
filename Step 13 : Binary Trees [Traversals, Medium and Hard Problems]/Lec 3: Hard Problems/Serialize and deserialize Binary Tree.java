public class Codec {

    // Encodes a tree to a single string.
        public void s(Queue <TreeNode>q , StringBuilder sb)
        {
            while(!q.isEmpty())
            {
                TreeNode temp = q.remove();
                if(temp==null)
            {sb.append(".,");continue;}
            sb.append(temp.val+",");
            q.add(temp.left);
            q.add(temp.right);
            }
        }

    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder("");
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        s(q,sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public void t(String data , TreeNode root)
        {
            int i=0;
            Queue<TreeNode> q = new LinkedList();
            q.add(root);
            while(i<data.length())
            {
                TreeNode temp = q.remove();
            int x;
          for(x=i;x<data.length();x++)
        {
            if(data.charAt(x)==',')
            break;
        }
        if(data.substring(i,x).equals("."))
                temp.left=null;
                else
                {temp.left=new TreeNode(Integer.parseInt(data.substring(i,x)));q.add(temp.left);}
                i=x+1;
          for(x=i;x<data.length();x++)
        {
            if(data.charAt(x)==',')
            break;
        }
        if(data.substring(i,x).equals("."))
                temp.right=null;
                else
                {temp.right=new TreeNode(Integer.parseInt(data.substring(i,x)));q.add(temp.right);}
                i=x+1;
            }
        }
    public TreeNode deserialize(String data) {
        if(data.length()==0)
        return null;
        int x;
        for(x=0;x<data.length();x++)
        {
            if(data.charAt(x)==',')
            break;
        }
        TreeNode root = new TreeNode(Integer.parseInt(data.substring(0,x)));
        t(data.substring(x+1,data.length()),root);
        return root;
    }
}