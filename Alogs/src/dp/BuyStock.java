package dp;
/**
 * 
 * @author Vinny366
 *	Buy on day and sell on any following days
 *  fin out the Minimum till today and check if it is maximum. if max update or set to previous max;
 *  
 *  initial min = Integer.MAX_VALUE;
 *  initial max = 0;
 * 
 */
public class BuyStock {

	public static void main(String[] args) {
		int[] prices = {100, 90, 80, 70, 160};
		int max = maxProfit(prices);
		System.out.println(max);
	}
	public static int maxProfit(int[] prices){
		int min = Integer.MAX_VALUE;
		int max  =0;
		for(int i =0 ;i< prices.length;i++){
			min = Math.min(min, prices[i]);
			max = Math.max(max, prices[i] - min);
		}
		return max;
		
	}
}
