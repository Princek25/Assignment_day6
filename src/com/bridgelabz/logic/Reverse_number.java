package com.bridgelabz.logic;
import java.util.Scanner;


public class Reverse_number {
    public static void main(String[] args) {
        int number;
        int reverse = 0;
        int remainder;
        System.out.println("enter number to reverse: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while (number != 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
