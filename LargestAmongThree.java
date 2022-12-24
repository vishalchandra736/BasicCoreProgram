package com.blz.basiccoreprogram;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        int numArray[] =new int [3];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            System.out.println("Enter the Number " + (i+1) + " :");
            numArray[i] = scan.nextInt();
        }
        if (numArray[0] > numArray[1] && numArray[0] > numArray[2])
            System.out.println(numArray[0] +" Largest among three numbers");
        else if (numArray[1] > numArray[2])
            System.out.println(numArray[1] + " Largest among three numbers");
        else
            System.out.println(numArray[2] + " Largest among three numbers");
    }
}
