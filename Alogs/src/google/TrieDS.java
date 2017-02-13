package google;

import java.util.HashMap;
import java.util.Map;

class TrieNode{
	boolean endOfWord;
	Map<Character,TrieNode> children;
	
	public TrieNode(){
		endOfWord = false;
		children = new HashMap<>();
	}
}

public class TrieDS {	
	private final TrieNode root;
    public TrieDS() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur = root;
        for(int i=0;i<word.length();i++){
        	TrieNode node =cur.children.get(word.charAt(i));
        	if(node==null){
        		node = new TrieNode();
        		cur.children.put(word.charAt(i), node);
          	}
        	cur = node;
        }
        cur.endOfWord = true;
    }
    
  
    
    public boolean search(String word) {
       TrieNode cur = root;
       for(int i=0;i<word.length();i++){
    	   char ch = word.charAt(i);
    	   if(cur.children.get(ch) == null)
    		   return false;
    	   cur = cur.children.get(ch);
       }
       return cur.endOfWord;
    }
   
	public static void main(String[] args) {
		TrieDS jj = new TrieDS();
		jj.insert("vineel");
		
		System.out.println(jj.search("vinee"));
	}

}
