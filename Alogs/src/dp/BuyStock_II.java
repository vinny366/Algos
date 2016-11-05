package dp;

/**
 *  Here we should find the profit in more than 1 transaction but it should be maximum
 *  
 *  As we know finding the difference between i & i+1 gets maxiumim becuasue if we have something bigger in i+3
 *   we can do it for (i+1) to (i+3) also gives same value
 */
public class BuyStock_II {

	public static void main(String[] args) {
		int[] prices = {100, 90, 80, 70, 160};
		int max = maxProfit(prices);
		System.out.println(max);
	}

	private static int maxProfit(int[] prices) {
		int myProfit = 0;
		for(int i=1;i<prices.length;i++){
			if(prices[i] - prices[i-1] > 0){
				myProfit += prices[i] - prices[i-1];
			}
		}
		return myProfit;
	}

}
