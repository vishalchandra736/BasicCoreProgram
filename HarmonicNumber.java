package com.blz.basiccoreprogram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int N;
        double harmonicValue = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        N = scan.nextInt();
        if (N != 0) {
            for (int i=0; i<N; i++){
                harmonicValue += (double)1/(i+1);
            }
            System.out.println("Harmonic Value is : " + harmonicValue);
        }
        else {
            System.out.println("Invalid Input!!!");
        }

    }
}
