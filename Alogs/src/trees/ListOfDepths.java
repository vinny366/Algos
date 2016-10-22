package trees;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * We made recursive calls;
 * Taken List of linkedlists, level
 * if level == size of List  == create a new linked list
 * add the root;
 * add it to main
 * else get the LL corrosponding to level add the root 
 */
public class ListOfDepths {

	public static void main(String[] args) {
		BinaryTree bt = BinaryTree.sample();		
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
		depth(bt.root, lists,0);
		System.out.println(lists);
	}

	private static void depth(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
		if(root == null)
			return;
		
		LinkedList<TreeNode> list = null;
		
		if(lists.size() == level){
			list = new LinkedList<TreeNode>();
			list.add(root);
			lists.add(list);
			
		}else{
			list = lists.get(level);
			list.add(root);
		}
		
		depth(root.left,lists,level+1);
		depth(root.right,lists,level+1);
		
	}

}
