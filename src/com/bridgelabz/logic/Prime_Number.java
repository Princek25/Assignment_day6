package com.bridgelabz.logic;
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        int i, count, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();

        for(i=1; i<=n; i++) {
            count=0;
            for(j=i; j<=i; j++){
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.println(i);


        }
    }
}
