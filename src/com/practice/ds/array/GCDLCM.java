package com.practice.ds.array;

import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter both numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int n1=num1;
        int n2=num2;

        while (num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = (n1*n2)/gcd;

        System.out.println("GCD is:"+ gcd+" and LCM is:"+lcm);
    }
}
