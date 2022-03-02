package com.practice.ds.array;

public class SwapFaceIndex {
    public static void main(String[] args) {
        int res;
        int number = 613245; //res 612435
        //int number = 231465; //res 213564
        //int number = 453621; //res 356421
        res = swapFaceIndex(number);
        System.out.println(res);
    }

    private static int swapFaceIndex(int number) {
        int res = 0;
        int face;
        int index = 1;
        while(number>0){
            face = number%10;
            res = res+ (int) Math.pow(10, face-1)*index;
            index++;
            number/=10;
        }
        return res;
    }
}
