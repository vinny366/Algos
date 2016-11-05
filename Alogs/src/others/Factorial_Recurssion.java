package others;

public class Factorial_Recurssion {

	public static void main(String[] args) {
		int n = 6;
		int answer = findfact(n);
		System.out.println(answer);
	}

	private static int findfact(int n) {
		if(n==1)
			return 1;
		return n * findfact(n-1);
	}

}
