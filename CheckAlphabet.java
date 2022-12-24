package com.blz.basiccoreprogram;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        char alphabet;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Alphabet : ");
        alphabet = scan.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')
            System.out.println("Alphabet is Vowel");
        else
            System.out.println("Alphabet is Consonant");
    }

}
