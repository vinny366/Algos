package others;

public class Factorial_Iterative {

	public static void main(String[] args) {
		int n = 5;
		int ans = factIte(n);
		System.out.println(ans);
	}

	private static int factIte(int n) {
		int res = 1;
		while(n!=1){
			res= res * n;
			n--;
		}
		return res;
	}

}
