package trees;

import java.util.Stack;

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
		
		tree1.breadthTraversal(tree1.root);
		System.out.println("===================");
		tree2.breadthTraversal(tree2.root);
		
		TreeNode outputNode = mergeTrees(tree1.root,tree2.root);
	}

	private static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		TreeNode temp1 = root1;
		TreeNode temp2 = root2;
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		while(temp1!=null || temp2!=null){
			temp1= temp1.left;
			temp2= temp2.left;
			
		}
		return null;
		
	}

}
