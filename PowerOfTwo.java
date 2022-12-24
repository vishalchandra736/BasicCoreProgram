package com.blz.basiccoreprogram;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int N;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Power Value : ");
        N = scan.nextInt();
        if (N >= 0 && N <31) {
            System.out.println("Table of 2's Power till  0 to " + N);
            for (int i=0; i<=N; i++) {
                System.out.println("2 Power " + i + " = " +(int)(Math.pow(2,i)));
            }
        }
        else {
            System.out.println("Invalid Input!!!");
        }
    }
}
