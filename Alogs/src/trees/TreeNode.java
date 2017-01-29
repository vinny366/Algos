package trees;

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
