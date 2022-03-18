package com.practice.algo.dp;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr={2,3,4,8,9,0,4,6,5};
        int n = arr.length;
        findLIS(n, arr);
    }

    private static void findLIS(int n, int[] arr) {

        int max = Integer.MIN_VALUE;

        int[] lis= new int[n];
        for(int i=0; i<n;i++){
            lis[i] = 1;
        }

        for(int i=0; i<n;i++){
            for (int j=0;j<i; j++){
                if(arr[i]>arr[j] && lis[i]<lis[j]+1){
                    lis[i] = lis[j]+1;
                }
            }
        }

        for (int i=0;i<n;i++){
            if(lis[i]>max){
                max = lis[i];
            }
        }
        System.out.println("LIS is:"+ max);
    }
}
