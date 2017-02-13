package google;

public class MaxSumNoSide {

	public static void main(String[] args) {
		int[] a = {5,100,5,-95,200,12,100};
		findMax(a);
	}

	private static void findMax(int[] a) {
		int excl = 0;
		int incl = a[0];
		int excl_new;
		
		for(int i=1;i<a.length;i++){
			excl_new = Math.max(excl, incl); //5  , 100
			incl = excl +a[i];			     // 100 , 
			excl = excl_new;	// 5
		}
		
		System.out.println((excl>incl)?excl:incl);
	}

}
