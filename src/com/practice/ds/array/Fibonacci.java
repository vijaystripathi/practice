package com.practice.ds.array;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        int a = printfib(n);
        System.out.println(a);
    }

    private static int printfib(int n) {

        if(n==0 || n==1){
            return n;
        }
        else{
            return printfib(n-1)+printfib(n-2);
        }
    }
}
