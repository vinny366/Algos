package trees;

/**
 * 
 * @author Vinny366
 *  For each node we should give the min and max value so we pass 
 *  parameters root, min, max
 */
public class Is_BST {

	public static void main(String[] args) {
		BinaryTree bt = BinaryTree.sample();
		
		System.out.println(check_bst(bt.root,null,null));

	}

	private static boolean check_bst(TreeNode root, Integer min, Integer max) {
		if(root == null)
			return true;
		
		if( (min != null && root.data < min) || (max != null && root.data > max) ){
			return false;
		}
		
		if(!check_bst(root.left, min, root.data) || !check_bst(root.right, root.data, max)){
			return false;
		}
		return true;
	}

}
