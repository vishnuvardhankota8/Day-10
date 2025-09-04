package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any number:");
		int num=scanner.nextInt();
		int count=0;
		while(num!=0){
			num/=10;
			count++;
			
		}
		System.out.println(count);
		scanner.close();
	}

}
