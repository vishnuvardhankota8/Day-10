package com.codegnan.controlstatements;

import java.util.Scanner;

public class digitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scanner.nextInt();
        int sum = 0;

        while(num != 0){
            int digit = num % 10;   // get last digit
            sum = sum + digit;      // add to sum
            num = num / 10;         // remove last digit
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
