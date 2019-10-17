/*
DESCRIPTION:
	You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
	
	Example 1:
	
	Input: coins = [1, 2, 5], amount = 11
	Output: 3 
	Explanation: 11 = 5 + 5 + 1
	Example 2:
	
	Input: coins = [2], amount = 3
	Output: -1

SOLUTION
	Runtime: 15 ms, faster than 46.04% of Java online submissions for Coin Change.
	Memory Usage: 35.8 MB, less than 98.82% of Java online submissions for Coin Change.
 */


import java.util.Arrays;

public class CoinChange {
	public int coinChange (int[] coins, int amount) {
		int max = amount + 1;
		int [] cache = new int[max];
		Arrays.fill(cache, max);
		cache[0] = 0;
		
		for (int i = 1; i < cache.length; i ++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					cache[i] = Math.min(cache[i], 1+ cache[i-coins[j]]);
				}
			}
		}
		if (cache[amount] > amount) {
			cache[amount] = -1;
		}
		return cache[amount];
	}
}
