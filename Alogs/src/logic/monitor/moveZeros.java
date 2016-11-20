package logic.monitor;

public class moveZeros{
	public static void main(String[] args){
		int[] arr ={1,1,0,0,0,1,1,0,1,0,1,0,1,0};
		movezerosRight(arr);
		System.out.println("---");
		movezerosLeft(arr);
	}

	private static void movezerosLeft(int[] arr) {
		int start = 0;
		int end = arr.length -1;
		while(start<=end){
			while(arr[start] == 0){
				start++;
			}
			while(arr[end]==1){
				end --;
			}
			if(start<end){
			arr[start] = 0;
			arr[end] = 1;
			}
		}

		printArray(arr);
		
	}

	public static void movezerosRight(int[] arr){
		int start = 0;
		int end = arr.length -1;
		while(start<=end){
			while(arr[start] == 1){
				start++;
			}
			while(arr[end]==0){
				end --;
			}
			if(start<end){
			arr[start] = 1;
			arr[end] = 0;
			}
		}

		printArray(arr);
	}

	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + ",");
		}
	}
}