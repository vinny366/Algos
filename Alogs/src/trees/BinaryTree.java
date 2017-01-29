package trees;

import java.util.LinkedList;
import java.util.Queue;

/*
 *                        60
 *                   50          30
 *                
 *                40    20     80    null
 *                
 *      null,null      25 70 | 64 56
 */


 class BinaryTree {

	public TreeNode root = null;
		
	public BinaryTree(){
		root = null;
	}
	public static BinaryTree sample(){
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(60);
		TreeNode n1 = new TreeNode(50);
		TreeNode n2 = new TreeNode(70);
		TreeNode n3 = new TreeNode(40);
		TreeNode n4 = new TreeNode(20);
		TreeNode n5 = new TreeNode(68);	
		TreeNode n7 = new TreeNode(58);
		
		tree.root.setLeft(n1);//50
		tree.root.setRight(n2); //70
		n1.setLeft(n3);//40
		n1.setRight(n4);//55
		n2.setLeft(n5);	
		n4.setRight(n7);
		
		
		return tree;
	}

	public void inOrderTraversal(TreeNode root){
		
		if(root != null){
			inOrderTraversal(root.left);
			System.out.print(root.data +"-->");
			inOrderTraversal(root.right);
			
		}
	}
	
	public void breadthTraversal(TreeNode root){
		int level = 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty()){
			int size = q.size();
			while(size>0){
				TreeNode temp = q.poll();
				System.out.print(temp.data + ",");
				if(temp.left !=null)
					q.add(temp.left);
				if(temp.right != null)
					q.add(temp.right);
				size--;
			}
			System.out.println("");
			
		}
	}
}
