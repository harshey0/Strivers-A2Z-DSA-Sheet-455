
class Trie {

    class Node{
 Node children[];
        boolean eow;
        Node()
        {
            children = new Node[26];
            eow = false;
            for(int x=0;x<26;x++)
            {
                children[x]=null;
            }
        }
}
       Node root;
    public Trie() {
           root = new Node();
    }
    
    public void insert(String word) {
        Node temp = root;
        for(int x=0;x<word.length();x++)
        {
            if(temp.children[(int)(word.charAt(x)-'a')]==null)
            temp.children[(int)(word.charAt(x)-'a')] = new Node();
        temp = temp.children[(int)(word.charAt(x)-'a')];
        }
        temp.eow=true;
    }
    
    public boolean search(String word) {
         Node temp = root;
        for(int x=0;x<word.length();x++)
        {
            if(temp.children[(int)(word.charAt(x)-'a')]==null)
            return false;
        temp = temp.children[(int)(word.charAt(x)-'a')];
        }
        return temp.eow==true;       
        
    }
    
    public boolean startsWith(String prefix) {
         Node temp = root;
        for(int x=0;x<prefix.length();x++)
        {
            if(temp.children[(int)(prefix.charAt(x)-'a')]==null)
            return false;
        temp = temp.children[(int)(prefix.charAt(x)-'a')];
        }
        return true;
    }
}