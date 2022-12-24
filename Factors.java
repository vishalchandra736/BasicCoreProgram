package com.blz.basiccoreprogram;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = scan.nextInt();
        System.out.println("Prime Factors of " + num + " is : ");
        for (int i=2; i<=num; i++) {
            while (num%i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }
    }
}
