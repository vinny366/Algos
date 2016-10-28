package V_linkedList;
/**
 * 
 * @author Vinny366
 *   Method 1: 
 *   store the counterparts address in hashTable. 
 *   Iterate the entire ll and assign them back
 *   See CopyOfLL to copy LinkedList without Random pointers
 *  
 */

class Node_random{
	int data;
	Node_random next;
	Node_random arbitrary;
	
	Node_random(int x){
		this.data =x;
		this.next = null;
		this.arbitrary = null;
	}
}

class RandomLL {
	public static Node_random createRandomLL(){
	Node_random r1 = new Node_random(1);
	Node_random r2 = new Node_random(2);
	Node_random r3 = new Node_random(3);
	
	r1.next = r2;
	r2.next = r3;
	
	r1.arbitrary = r3;
	r2.arbitrary = r1;
	r3.arbitrary = r2;
	return r1;
	}
}

public class copyWithrandom {

	public static void main(String[] args) {
		Node_random first_head = RandomLL.createRandomLL();
		
		Node_random cloneHead = clone(first_head);
		
//		printRandom(cloneHead);
	}

	private static void printRandom(Node_random cloneHead) {
		Node_random temp = cloneHead;
		while(temp != null){
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("-------------");
		
	}
	
	private static void printRandomArbit(Node_random cloneHead) {
		Node_random temp = cloneHead;
		while(temp != null){
			System.out.print(temp.data + "-next->");
			if(temp.next != null)
				System.out.print(temp.next.data + "-arbit-");
			System.out.print(temp.arbitrary.data + "-ori->");
			temp = temp.next;
			System.out.println();
			System.out.println(";;;;;;;;;");
		}
		System.out.println();
		System.out.println("-------------");
		
	}

	private static Node_random clone(Node_random first_head) {
		Node_random temp = first_head;
		
		while(temp != null){
			Node_random newNode = new Node_random(temp.data + 10);
			newNode.next = temp.next;
			temp.next =  newNode;
			temp = temp.next.next;
		}
		printRandom(first_head);		
		
		Node_random temp2 = first_head;
		
		while(temp2!=null){
			temp2.next.arbitrary = temp2.arbitrary.next;
			temp2 = temp2.next.next;
		}
	//	printRandomArbit(first_head);
		
		Node_random originalHead = first_head;
		Node_random cloneHead = first_head.next;
		Node_random mainOriginal = originalHead;
		Node_random mainClone = cloneHead;
		while(originalHead.next.next!=null){
			originalHead.next = originalHead.next.next;
			cloneHead.next = cloneHead.next.next;
			originalHead = originalHead.next;
			cloneHead = cloneHead.next;
		}
		originalHead.next =null;
		printRandom(mainClone);
		System.out.println("--------------printinh ori------------------");
		printRandom(mainOriginal);
		
		return first_head;
	}

}
