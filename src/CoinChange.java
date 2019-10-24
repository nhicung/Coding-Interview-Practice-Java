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
		// create an array to keep track of the minimum number of coins needed for 0 money till 
		//the amount of money needed (0 -> amount); initially fill the array with amount+1 because 
		// this is the amount of money that is sure more than needed and will help update the min later
		// (to fill into the array.
		int max = amount + 1;
		int [] cache = new int[max];
		Arrays.fill(cache, max);
		cache[0] = 0;
		
		//go through nested for loop (the cache array and the coins array
		//
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
