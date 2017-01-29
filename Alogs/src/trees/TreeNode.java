package trees;

import java.util.LinkedList;
import java.util.Queue;

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
	
	/*
	 * Q.size() and 2 while loops is main thing here
	 */
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
