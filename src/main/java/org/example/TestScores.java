package org.example;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100");
        int num = input.nextInt();
        if (num <= 100 && num >= 90){
            System.out.println("Your grade is an A");
        }else if (num <= 89 && num >= 80){
            System.out.println("Your grade is a B");
        }else if (num <= 79 && num >= 70){
            System.out.println("Your grade is a C");
        }else if (num <= 69 && num >= 60){
            System.out.println("Your grade is a D");
        }else if (num <= 59 && num >= 0){
            System.out.println("Your grade is a f");
        }else {
            System.out.println("You suck");
        }
    }
}
