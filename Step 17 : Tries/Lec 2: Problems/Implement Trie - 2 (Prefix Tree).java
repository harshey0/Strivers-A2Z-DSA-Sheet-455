import java.util.* ;
import java.io.*; 
public class Trie {
     class Node{
         int freq;
         int word;
 Node children[];
        Node()
        {
            freq=1;
            word=0;
            children = new Node[26];
            for(int x=0;x<26;x++)
            {
                children[x]=null;
            }
        }
}
       Node root;
    public Trie() {
        // Write your code here.
          root = new Node();
    }

    public void insert(String word) {
        // Write your code here.
           Node temp = root;
        for(int x=0;x<word.length();x++)
        {
            if(temp.children[(int)(word.charAt(x)-'a')]==null)
            temp.children[(int)(word.charAt(x)-'a')] = new Node();
            else temp.children[(int)(word.charAt(x)-'a')].freq++;
        temp = temp.children[(int)(word.charAt(x)-'a')];
        }
        temp.word++;
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
           Node temp = root;
        for(int x=0;x<word.length();x++)
        {
            if(temp.children[(int)(word.charAt(x)-'a')]==null)
            return 0;
        temp = temp.children[(int)(word.charAt(x)-'a')];
        }
        return temp.word; 
    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
         Node temp = root;
        for(int x=0;x<word.length();x++)
        {
            if(temp.children[(int)(word.charAt(x)-'a')]==null)
            return 0;
        temp = temp.children[(int)(word.charAt(x)-'a')];
        }
        return temp.freq;
    }

    public void erase(String prefix) {
        // Write your code here.
                 Node temp = root;
        for(int x=0;x<prefix.length();x++)
        {
        
        temp = temp.children[(int)(prefix.charAt(x)-'a')];
            temp.freq--;
        }
        temp.word--;
        return;
    }

}