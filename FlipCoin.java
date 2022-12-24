package com.blz.basiccoreprogram;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int headCount = 0;
        int tailCount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times flip the coin : ");
        int num = scan.nextInt();
        if(num < 0) {
            System.out.println("Invalid Input!!! Try any Positive Number");
        }
        else {
            int[] flipCoin = new int[num];
            for (int i = 0; i < num; i++) {
                flipCoin[i] = (int) (Math.random() * 10);
            }
            for (int i = 0; i < num; i++) {
                if (flipCoin[i] < 5)
                    headCount++;
                else
                    tailCount++;
            }
            int Head_VS_Tail = (headCount - tailCount) * 100 / num;
            System.out.println("Percentage of Head vs Tails are : " + Head_VS_Tail + "%.");
        }

    }
}
