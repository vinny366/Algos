package others;

/**
 * This is formula Sqrt (n+1) = sqrt(n) + (num/sqrt(n))/2
 * 
 * The 1st Square root is num /2;
 * 
 * @author Vinny366
 *
 */
public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(sqrt(6));

	}

	public static double sqrt(int number) {
		double t;
		double squareRoot = number / 2;
		
		do{
			t = squareRoot ;
			squareRoot =  (t + (number/t))/2;
		}while(t-squareRoot !=0);

		return squareRoot;
	}

}
