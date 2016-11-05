package arrays;

/**
 * 
 * @author Vinny366 Given an array with 0's and 1's sort the array such that all
 *         0's are in front and all 1's to end Take 2 pointers front and last;
 *         swap if the condition doesnt occur
 */
public class Arrays0_1 {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1 };

		arr = sortThis(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "--");
		}
	}

	public static int[] sortThis(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] == 1) {
				if (arr[j] == 0) {
					arr[i] = 0;
					arr[j] = 1;
					i++;
					j--;
				} else {
					j--;
				}
			} else {
				i++;
				//
			}
		}
		return arr;
	}

}
