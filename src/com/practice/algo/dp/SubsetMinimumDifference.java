package com.practice.algo.dp;

public class SubsetMinimumDifference {
    public static void main(String[] args) {
        int[] arr={1,2,7};
        //int[] arr={1,6,11,5};
        int n = arr.length;

        System.out.println(findMinDifference(arr, n));
    }
    static int findMinDifference(int[] arr, int n){
        int sum = 0, min=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        int[][] t = new int[n+1][sum+1];
        int[] nRow = new int[sum+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0){
                    t[i][j] = 0;
                }
                if(j==0){
                    t[i][j] = 1;
                }
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        int k=0;

        while (k<=sum) {
            nRow[k] = t[n][k];
            k++;
        }
        //s1 and s2 are two sets which will make the range. i,e s1+s2= range
        //to calculate min, s1 has to be smaller than s2, i.e it should be less than range/2
        // now min = s2- s1; also s2 = range - s1.
        // so min = range - 2s1;

        int count = -1;

        for(int l=0; l<=sum/2; l++){
            if(nRow[l] != 0)
                min = Math.min(min, sum-(2*l));
        }
        return min;
    }
}
