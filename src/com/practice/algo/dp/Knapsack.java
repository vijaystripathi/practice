package com.practice.algo.dp;

public class Knapsack {
    public static void main(String[] args) {
        int[] weight={10, 20, 30};
        int[] value={60, 100, 120};

        int n = weight.length;

        int capacity= 50;

        System.out.println(knapsack(weight,value,capacity, n));
    }

    private static int knapsack(int[] weight, int[] value, int capacity, int n) {
        int[][] mat = new int[n+1][capacity+1];

        for(int i=0; i<=n; i++){
            for (int j=0; j<=capacity; j++){
                if(i==0 || j==0){
                    mat[i][j] = 0;
                }
            }
        }

        for(int i=1; i<=n; i++){
            for (int j=1; j<=capacity; j++){
                if(weight[i-1] > j){
                    mat[i][j] = mat[i-1][j];
                }
                else{
                    mat[i][j] = Math.max((value[i-1]+ mat[i-1][j-weight[i-1]]),mat[i-1][j]);
                }
            }
        }
        return mat[n][capacity];

    }
}
