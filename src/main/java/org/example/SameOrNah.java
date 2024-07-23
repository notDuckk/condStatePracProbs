package org.example;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word1 = input.nextLine();

        System.out.println("Enter another word:");
        String word2 = input.nextLine();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if (word1.equals(word2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are not the same");
        }

    }
}
