package com.practice.ds.array;

import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of bulbs");
        int b = s.nextInt();

        for(int i=1; i*i<=b; i++){
            System.out.println(i*i);
        }
    }
}
