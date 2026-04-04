package com.apurbo.university;

public class BinaryKnapSack {

    static int knapsack(int W, int[] wt, int[] val, int n) {

        int[][] V = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {

                if (i == 0 || w == 0) {
                    V[i][w] = 0;
                }

                else if (wt[i - 1] > w) {
                    V[i][w] = V[i - 1][w];
                }

                else {
                    V[i][w] = Math.max(
                            V[i - 1][w],
                            V[i - 1][w - wt[i - 1]] + val[i - 1]
                    );
                }
            }
        }
        return V[n][W];
    }

    public static void main(String[] args) {
        int[] val = {3, 4, 5};
        int[] wt = {2, 3, 4};
        int W = 5;

        int n = val.length;

        System.out.println("Maximum value = " + knapsack(W, wt, val, n));
    }
}
