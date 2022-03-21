package com.practice.algo.dp;

public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr= {2,3,8,13};
        //int[] arr= {2,1,8,13};
        int n = arr.length;

        int sum = 26;

        System.out.println(findEqualSum(arr, n , sum));
    }

    public static boolean findEqualSum(int[] arr, int n, int sum){
        int totalSum = 0;
        boolean[][] t= new boolean[n+1][(sum/2)+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<= sum/2; j++){
                if(i==0){
                    t[i][j] = false;
                }
                if(j==0){
                    t[i][j] = true;
                }
            }
        }

        for(int i=0; i<n; i++){
            totalSum = arr[i] + totalSum;
        }

        if(totalSum % 2 !=0 || sum != totalSum){
            return false;
        }

        for(int i=1; i <= n; i++){
            for(int j=1; j <= sum/2; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum/2];
    }
}
