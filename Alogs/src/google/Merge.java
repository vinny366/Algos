package google;

public class Merge {

	public static void main(String[] args) {
		int[] ar = {12,5,33,1,55,38,89};
		int low = 0;
		int high = ar.length-1;
		Merge(ar,low,high);
//		HashMap<Integer,Integer> h = new HashMap<>();
	
		
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
	}

	private static void Merge(int[] ar, int low, int high) {
		int mid = (low+high)/2;
		if(low<high){
			Merge(ar,low,mid);
			Merge(ar,mid+1,high);
			doMerge(ar,low,mid,high);
		}
	}

	private static void doMerge(int[] ar, int low, int mid, int high) {
		int n1 = mid-low +1;
		int n2 = high-mid;
		int[] L = new int[n1];
		int[] R = new  int[n2];
		for(int i=0;i<n1;i++){
			L[i] = ar[low+i];
		}
		for(int j=0;j<n2;j++){
			R[j] = ar[mid+1+j];
		}
		int i=0;
		int j=0;
		int k=low;
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				ar[k] = L[i];
				i++;
			}else{
				ar[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			ar[k] = L[i];
			i++;
			k++;
		}
		while(j<n2){
			ar[k] = R[j];
			j++;
			k++;
		}
		
	}
	
	
		
}
