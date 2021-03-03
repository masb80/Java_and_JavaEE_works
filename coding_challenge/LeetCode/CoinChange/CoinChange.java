package CoinChange;

import java.util.Arrays;

//https://leetcode.com/problems/coin-change/
/*
You are given coins of different denominations and a total amount of
 money amount. Write a function to compute the fewest number of coins 
 that you need to make up that amount. If that amount of money cannot 
 be made up by any combination of the coins, return -1.
*/
public class CoinChange {
    public static void main(String[] args){
        int [] coins = {1,2,5};
        coingChange(coins, 11);
    }

    private static void coingChange(int[] coins, int amount) {
        // Bottom Up method
        int[] dp = new int [amount+1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        // although last oner will be the answer, we will solve every subproblem and 
        // memoize the value for space and time complexity
        for(int i = 0; i <= amount; i++){ // mmount from 0 to 11 , ammount array
            // we are making subproblem for each number and then checking the ways
            for(int j = 0; j < coins.length; j ++){    // coins array            
                if(coins[j] <= i){
                    // System.out.println("i   "+i+"    coins[j]   "+coins[j] +"    dpi    " + dp[i] +" dp[i - coins[j]  "+ (i - coins[j]) );
                    // we are adding 1 because we are taking base as 1 and then add to the value or minimum ways
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]); // i - coins[j] means every coin subtractions
                   // System.out.print(dp[i] +"  ");
                }
            }            
        }
        System.out.println(dp[amount] > amount ? -1 : dp[amount]);        
    }

}