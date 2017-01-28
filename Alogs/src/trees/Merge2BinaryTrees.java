package trees;

public class Merge2BinaryTrees {

	public static void main(String[] args) {
		BinaryTree tree1 = BinaryTree.sample();
		BinaryTree tree2 = new BinaryTree();
		tree2.root = new TreeNode(55);
		tree2.root.left = new TreeNode(45);
		tree2.root.left.left = new TreeNode(35);
		tree2.root.left.right = new TreeNode(46);
		tree2.root.right = new TreeNode(75);
		tree2.root.right.left = new TreeNode(74);
		tree2.root.right.right = new TreeNode(76);
		
		tree1.inOrderTraversal(tree1.root);
		System.out.println("===================");
		tree2.inOrderTraversal(tree2.root);
	}

}
