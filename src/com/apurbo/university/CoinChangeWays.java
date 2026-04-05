package com.apurbo.university;

public class CoinChangeWays {

    public static int countWays(int[] coins, int amount) {

       int n = coins.length;

       int [][]dp = new int[n+1][amount+1];

       for(int i = 0; i <= n ; i++){
           dp[i][0] = 1;
       }

       for(int i = 1; i <= n; i++){
           for (int j = 1 ; j <= amount ; j++){
               if(coins[i-1] > j){
                   dp[i][j] = dp[i-1][j];
               }
               else {
                   int exclude = dp[i-1][j];
                   int include = dp[i][j-coins[i-1]];

                   dp[i][j]=exclude+include;
               }
           } 
       }

       return dp[n][amount];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 5;

        int result = countWays(coins, amount);

        System.out.println("Number of ways: " + result);
    }
}
