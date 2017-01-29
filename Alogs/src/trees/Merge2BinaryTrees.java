package trees;

import java.util.Stack;

public class Merge2BinaryTrees {

	public static void main(String[] args) {
		BinaryTree tree1 = BinaryTree.sample();
		BinaryTree tree2 = new BinaryTree();
		tree2.root = new TreeNode(56);
		tree2.root.left = new TreeNode(45);
		tree2.root.left.left = new TreeNode(35);
		tree2.root.left.right = new TreeNode(46);
		tree2.root.right = new TreeNode(75);
		tree2.root.right.left = new TreeNode(74);
		tree2.root.right.right = new TreeNode(76);

		tree1.breadthTraversal(tree1.root);
		System.out.println("===================");
		tree2.breadthTraversal(tree2.root);

		TreeNode outputNode = mergeTrees(tree1.root, tree2.root);
	}

	private static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		TreeNode temp1 = root1;
		TreeNode temp2 = root2;
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		while (temp1 != null || temp2 != null || !s1.isEmpty() || !s2.isEmpty()) {
			if (temp1 != null || temp2 != null) {
				if(temp1 != null){
					s1.push(temp1);
					temp1=temp1.left;
				}
				
				if(temp2 != null){
					s2.push(temp2);
					temp2=temp2.left;
				}
				
			} else {

				if (s1.isEmpty()) {
					while(!s2.isEmpty()){
						temp2 = s2.pop();
						temp2.left = null; // because we already have printed left sub tree 
						// inorder(temp2);
					}
				}
				
				if(s2.isEmpty()){
					while(!s1.isEmpty()){
						temp1 = s1.pop();
						temp1.left = null; 
						//inorder(temp1);
					}
				}
				// At this point temp1 & temp2 will be null // as they traversed till end
				temp1 = s1.peek();
				temp2 = s2.peek();
				if(temp1.data < temp2.data){
					System.out.print(temp1.data + ",");
					s1.pop();
					temp1= temp1.right;
					temp2=null;
				}else{
					System.out.print(temp2.data + ",");
					s2.pop();
					temp2= temp2.right;
					temp1=null;
				}
				
				
				
			}

		}
		return null;

	}

}
