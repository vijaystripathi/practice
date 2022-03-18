package com.practice.ds.array;

public class RecursiveFibonacci {

    static int n1=0, n2=1, n3=0;

    public static void main(String[] args) {

        RecursiveFibonacci obj = new RecursiveFibonacci();
        int input = 10;
        System.out.println("\nResult:");
        obj.RecFib(input);
    }
    public void RecFib(int n) {

        if(n == 0) {
            return;
        }

        n3 = n1 +n2;

        n1 = n2;
        n2 = n3;

        System.out.println(" "+n3);

        RecFib(n - 1);
    }
}
