package com.practice.ds.array;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        int res;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = s.nextInt();
        System.out.println("Enter number of rotations");
        int nor = s.nextInt();
        res = rotateNumber(number, nor);

        System.out.println("Rotated number: "+ res);
    }

    private static int rotateNumber(int number, int nor) {
        int divisor, multiplier, numberR, numberL, newNumber;
        int nod = countNod(number);

        if(nor > nod){
            nor = nor%nod;
        }
        if(nor == nod){
            return number;
        }

        divisor = (int)Math.pow(10, nor);
        multiplier = (int)Math.pow(10, nod-nor);

        numberR = number%divisor;
        numberL = number/divisor;

        newNumber = multiplier * numberR;
        newNumber += numberL;

        return newNumber;
    }

    private static int countNod(int number) {
        int digits = 0;
        while(number>0){
            number /= 10;
            digits++;
        }
        return digits;
    }
}
