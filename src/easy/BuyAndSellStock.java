package easy;

public class BuyAndSellStock {

	public static void main(String[] args) {
		int maxProfit = maxProfit(new int[] {7, 1, 5, 3, 6, 4});
System.out.println("maxProfit :: "+maxProfit);
	}
	
	public static int maxProfit(int[] prices) {
    int maxprofit=0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

}
