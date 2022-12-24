package com.blz.basiccoreprogram;

import java.util.Scanner;

public class ComputeDivision {
    public static void main(String[] args) {
        int dividend, divisor, quotient, remainder;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Dividend : ");
        dividend = scan.nextInt();
        System.out.println("Enter the Divisor : ");
        divisor = scan.nextInt();
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println("Quotient is : " + quotient);
        System.out.println("Remainder is : " + remainder);
    }
}
