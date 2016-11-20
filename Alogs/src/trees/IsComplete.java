package trees;
	/**
	 * 
	 * @author Vinny366
	 *Calculate the number of nodes (count) in the binary tree.
	 *Start recursion of the binary tree from the root node of the binary tree with index (i) being set as 0 and 
	 *the number of nodes in the binary (count).
	 * 
	 *If the current node under examination is NULL, then the tree is a complete binary tree. Return true.
	 *
	 *If index (i) of the current node is greater than or equal to the number of nodes in the binary tree (count)
	 * i.e. (i>= count), then the tree is not a complete binary. Return false.
	 * 
	 * Recursively check the left and right sub-trees of the binary tree for same condition.
	 *  
	 * For the left sub-tree use the index as (2*i + 1) while for the right sub-tree use the index as (2*i + 2).
	 */
public class IsComplete {

	public static void main(String[] args) {
		BinaryTree bt = BinaryTree.sample();
		int index = 0;
		int node_count = countNodes(bt.root);
		boolean flag = checkifBtComplete(bt.root,index,node_count);
		if(flag){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}

	private static boolean checkifBtComplete(TreeNode root,int index, int node_count) {
		
		if(root == null)
			return true;
		if(index>= node_count)
			return false;
 return ( (checkifBtComplete(root.left,2*index+1,node_count)) && (checkifBtComplete(root.right,2*index+2,node_count)));
	}

	private static int countNodes(TreeNode root) {
		if(root == null)
			return 0;
		return(1+countNodes(root.left) + countNodes(root.right));
		
	}

}
