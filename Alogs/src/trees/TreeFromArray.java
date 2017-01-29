package trees;

/**
 * 
 * @author Vinny366
 *  construct a balanced tree from sorted array;
 * get start, get end, 
 * recursively construct node
 * mid node = root;
 * root.left = mid node [left sub tree]
 * root.right = mid node[ right sub tree]  
 *
 */
public class TreeFromArray {
	
	public static void main(String[] args){
		int[] arr = {10,20,24,32,40,45,47};
		int start = 0;
		int end = arr.length-1;
		TreeNode output = constructTree(arr,start,end);
		output.breadthTraversal(output);
	}
	
	
	public static TreeNode constructTree(int[] arr,int start,int end){
		if(start>end)
			return null;
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = constructTree(arr,start,mid-1);
		root.right = constructTree(arr, mid+1, end);
		return root;
	}
	
	

	
	
}
