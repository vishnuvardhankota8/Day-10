package com.codegnan.controlstatements;

import java.util.Scanner;

public class CanteenSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int teaPrice = 10, cofeePrice = 15, samosaPrice = 20;
		int teaQty = 0, cofeeQty = 0, samosaQty = 0;
		int choice;
		double taxRate = 0.05;
		do {
			System.out.println("||=======Canteen MENU============||");
			System.out.println("||========= 1. View Menu=========||");
			System.out.println("||========= 2. Order Items ======||");
			System.out.println("||========= 3.View Bill==========||");
			System.out.println("||========= 4. CheckOut And Exit=||");
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("====== MENU=========");
				System.out.println(" 1. Tea- $ " + teaPrice);
				System.out.println(" 2. Cofee- $ " + cofeePrice);
				System.out.println(" 3. Samosa- $ " + samosaPrice);
				break;
			case 2:
				System.out.println("Enter Item Number to Order (1-3)");
				int item = scanner.nextInt();
				System.out.println("Enter Quantity ");
				int qty = scanner.nextInt();
				if (qty <= 0) {
					System.out.println("Quantity must be Greater Than 0");
					break;
				}
				switch (item) {
				case 1:
					teaQty += qty;
					System.out.println(qty + " Tea(s) Added");
					break;
				case 2:
					cofeeQty += qty;
					System.out.println(qty + " cofee(s) Added");
					break;
				case 3:
					samosaQty += qty;
					System.out.println(qty + " samosa(s) Added");
					break;
				default:
					System.out.println("Invalid Item Number." + " Please Chhose between 1-3");
					break;
				}
				break;
			case 3:
				int teaTotal = teaQty * teaPrice;
				int cofeeTotal = cofeeQty * cofeePrice;
				int samosaTotal = samosaQty * samosaPrice;
				int subTotal = teaTotal + cofeeTotal + samosaTotal;
				double tax = taxRate * subTotal;
				double grandTotal = subTotal + tax;

				System.out.println("====== Bill =========");
				if (teaQty > 0) {
					System.out.println("Tea x : " + teaQty + " =$ " + teaTotal);
				}
				if (cofeeQty > 0) {
					System.out.println("Cofee x : " + cofeeQty + " =$ " + cofeeTotal);
				}
				if (samosaQty > 0) {
					System.out.println("Samosa x : " + samosaQty + " =$ " + samosaTotal);
				}
				if (subTotal == 0) {
					System.out.println("No Items Ordered Yet");
				} else {
					System.out.println("Sub Total : " + subTotal);
					System.out.println("Tax(5%) " + tax);
					System.out.println("Total = " + grandTotal);
				}
				break;
			case 4:
				System.out.println("Thank you!. Existing system");
				break;
			default:
				System.out.println("In Valid Choice."
						+ " Please Enter A Number from 1 to 4");
				break;
			}
		} while (choice != 4);
		scanner.close();
	}
}