package v_linkedList;

import java.util.HashMap;

/**
 * 
 * @author Vinny366 Here the recently used will be in tail Head will be where we
 *         remove an element
 */

public class LRU_CACHE {

	HashMap<Integer, DLLNode> cache;
	int capacity = 0;
	DLLNode head = null;
	DLLNode tail = null;

	public LRU_CACHE(int cap) {
		cache = new HashMap<Integer, DLLNode>(cap);
		capacity = cap;
	}
	public int get(int key){
		if(cache.containsKey(key)){
			int target = cache.get(key).value;
			cache.get(key).update();
			return target;
		}else{
			return -1;
		}
	}
	public void set(int key, int value) {
		if (cache.containsKey(key)) {
			DLLNode target = cache.get(key);
			target.value = value;
			target.update();
		} else if (cache.size() == capacity) {
			cache.remove(head.key);
			head.removeHead();

		} else {
			DLLNode newNode = new DLLNode(key, value);
			newNode.append();
			cache.put(key, newNode);
		}
	}

	class DLLNode {
		DLLNode left;
		DLLNode right;
		int key;
		int value;

		public DLLNode(int key, int value) {
			this.key = key;
			this.value = value;
		}

		public void removeHead() {
			if (head.right != null) { // here head will be tail
				head = head.right;
				head.left = null;
			} else {
				head = null;
				tail = null;
			}
		}

		public void update() {
			if (this == tail) {
				return;
			} else {
				if (this != head) {
					head = head.right;
				} else {
					this.left.right = this.right;
					this.right.left = this.left;
					
				}
				this.append();
			}
		}

		public void append() {
			if (tail == null) {
				head = this;
				tail = this;
			} else {
				this.right = null;
				this.left = tail;
				tail.right = this;
				tail = this;
			}
		}
	} // DLLNode class

}
