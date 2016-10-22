package trees;

public class CheckBalanced {

	public static void main(String[] args) {
		BinaryTree bt = BinaryTree.sample();
		boolean flag = isBalanced(bt.root);
		System.out.println(flag);
	}

	private static boolean isBalanced(TreeNode root) {
		int s = calHeight(root.left);
		int p = calHeight(root.right);
		if(Math.abs((s-p)) == 1 || Math.abs((s-p)) == 0)
			return true;
			
		return false;
	}

	private static int calHeight(TreeNode root) {
		if(root == null)
			return 0;
		int lheight = calHeight(root.left);
		int rheight = calHeight(root.right);
		return (Math.max(lheight, rheight)+1);

	}



}
