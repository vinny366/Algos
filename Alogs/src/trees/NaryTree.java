package trees;

import java.util.ArrayList;
import java.util.List;

class NaryNode {
	int value;
	NaryNode parent;
	List<NaryNode> children = new ArrayList<NaryNode>();

	NaryNode(int x) {
		this.value = x;
	}

	public void addChild(NaryNode childNode) {
		childNode.parent = this;
		this.children.add(childNode);
	}

}

public class NaryTree {
	public NaryNode root = new NaryNode(10);

	public NaryTree() {
		root.parent = null;
	}

	public void traverseTree(NaryNode rootNode)// depth first
	{
		System.out.println(rootNode.value);
		if (rootNode.children.size() != 0)
			for (NaryNode ch : rootNode.children)
				traverseTree(ch);
	}

	public static void main(String[] args) {
		NaryTree mytree = new NaryTree();

		NaryNode n2 = new NaryNode(20);
		NaryNode n3 = new NaryNode(3);
		NaryNode n4 = new NaryNode(15);

		NaryNode n5 = new NaryNode(8);
		NaryNode n6 = new NaryNode(45);
		NaryNode n7 = new NaryNode(22);

		NaryNode n8 = new NaryNode(11);
		NaryNode n9 = new NaryNode(16);
		NaryNode n10 = new NaryNode(18);

		NaryNode n11 = new NaryNode(7);

		mytree.root.addChild(n2);
		mytree.root.addChild(n3);
		mytree.root.addChild(n4);

		n2.addChild(n5);
		n2.addChild(n6);
		n2.addChild(n7);

		n3.addChild(n8);
		n3.addChild(n9);
		n3.addChild(n10);

		n4.addChild(n11);

		// mytree.traverseTree(mytree.root);
		int max = Integer.MIN_VALUE;
		int maxavg = calculateaverage(mytree.root,max);
		System.out.println(maxavg);
	}

	private static int calculateaverage(NaryNode root,int max) {
		int sum = 0;
		int count =0;
		if(root.children.size() == 0)
			return root.value;
		for(NaryNode cc : root.children){
			int tmp = calculateaverage(cc,max);
			if(cc.children.size()>0 && tmp>max){
				max =tmp;
			}
			sum+=cc.value;
			count++;
		}
		sum = sum/count;
		if(sum>max)
			max = sum;
		return max;
	}

}
