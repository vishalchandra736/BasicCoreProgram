package com.blz.basiccoreprogram;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void swap(int num1, int num2){
        System.out.println("Before Swap - Number1 : " + num1 + "    Number2 : " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swap - Number1 : "+ num1 + "   Number2 : " + num2);
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number 1 : ");
        num1 = scan.nextInt();
        System.out.println("Enter the Number 2 : ");
        num2 = scan.nextInt();
        swap(num1, num2);
    }
}
