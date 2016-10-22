package trees;

public class FirstCommonAncestor {

	public static void main(String[] args) {
		BinaryTree bt =  BinaryTree.sample();
		TreeNode Common = calCommon(bt.root, bt.root.left.left,bt.root.left.right.right);
		System.out.println(Common.data);

	}
	/**
	 *  root node gets the node from both sides then it is common ancester;
	 */
	private static TreeNode calCommon(TreeNode root, TreeNode n1, TreeNode n2) {
		if(root == null){
			return root;
		}
	    if(n1==root || n2 == root)    /// root and any other node --  root is ancestor
	    	return root;
	    TreeNode l = calCommon(root.left,n1,n2);
	    TreeNode r = calCommon(root.right,n1,n2);
	    if(l==null && r == null)  // if both left and right are null it returns null
	    	return null;
	    if(l != null && r != null){ // if both are true returns true;
	    	return root;
	    }
	    return l!=null? l : r;//if left subtree has 1 or right has 1 it returns the value present in either sub tree

	}

}
