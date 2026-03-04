/*
File: Converting Data Types
Author: Stephen Li
Date Created: Mar 4, 2026
Date Last Modified: Mar 4, 2026
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num1 = input.nextInt();
		int num2 = (int)num1;
		System.out.println(num2 + 3);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num1 = input.nextInt();
		String word1 = num1 + "4";
		double num2 = Double.parseDouble(word1);
		System.out.println(num2 + 2);
		
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a radius: ");
		double num1 = input.nextDouble();
		double num2 = (double)num1;
		System.out.println((num2 * num2) * 3.14);
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		num1 = (Math.floor((num1 * 12)));
		System.out.println(num1);
	}

}
