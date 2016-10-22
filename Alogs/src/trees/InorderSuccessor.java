package trees;

public class InorderSuccessor {

	public static void main(String[] args) {
		BinaryTree myTree = BinaryTree.sample();

		TreeNode mynode = myTree.root.left;

		TreeNode op = findSuccessor(mynode);

		System.out.println(op.data);

	}

	private static TreeNode findSuccessor(TreeNode mynode) {
		TreeNode nextNode = null;
		if (mynode.right != null) {
			nextNode = mynode.right;
			while (nextNode.left != null) {
				nextNode = nextNode.left;
			}
		}else if(mynode.left != null){
			nextNode = mynode.left;
			while (nextNode.right != null) {
				nextNode = nextNode.right;
			}
		}else{
			nextNode = mynode;
		}
		return nextNode;
	}

}
