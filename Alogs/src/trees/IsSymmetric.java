package trees;

public class IsSymmetric {

	public static void main(String[] args) {
		BinaryTree bt = BinaryTree.sample();
		boolean flag = checkSymmetry(bt.root , bt.root);
		if(flag)
			System.out.println(true);
		System.out.println(false);
	}

	private static boolean checkSymmetry(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null)
			return true;
		if(root1==null || root2 == null)
			return false;
		
		if(root1.data == root2.data){
			return checkSymmetry(root1.left, root2.right) && checkSymmetry(root1.right, root2.left); 
		}else{
			return false;
		}
	}

}
