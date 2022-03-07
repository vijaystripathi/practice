package com.practice.ds.array;

import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();

        System.out.println("Prime Factorisation: ");
        for(int div=2; div*div <= n; div++){
            while(n%div == 0){
                System.out.print(div +" ");
                n=n/div;
            }
        }
        if(n!=1)
            System.out.print(n);
    }
}
