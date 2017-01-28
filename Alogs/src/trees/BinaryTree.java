package trees;
/*
 *                        60
 *                   50          30
 *                
 *                40    20     80    null
 *                
 *      null,null      25 70 | 64 56
 */

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;

	public  TreeNode(int x){
		this.data = x;
		this.left = null;
		this.right = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
				
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
}
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
		TreeNode n5 = new TreeNode(80);
		TreeNode n6 = new TreeNode(25);
		TreeNode n7 = new TreeNode(70);
		TreeNode n8 = new TreeNode(64);
		TreeNode n9 = new TreeNode(56);
		tree.root.setLeft(n1);//50
		tree.root.setRight(n2); //70
		n1.setLeft(n3);//40
		n1.setRight(n4);//55
		n2.setLeft(n5);
		n4.setLeft(n6);
		n4.setRight(n7);
		n5.setLeft(n8);
		n5.setRight(n9);
		return tree;
	}

	public void inOrderTraversal(TreeNode root){
		
		if(root != null){
			inOrderTraversal(root.left);
			System.out.print(root.data +"-->");
			inOrderTraversal(root.right);
			
		}
	}
}
