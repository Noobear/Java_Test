package com.ch03;

import java.util.Scanner;

public class ch03_01 {

	public static void main(String args[]) {

		// 1

		Scanner input = new Scanner(System.in);

		int i;
		System.out.print("How old? : ");
		i = input.nextInt();

		if (i >= 19) {
			System.out.printf("%d years old : adult", i);
		} else {
			System.out.printf("%d years old : adolescent", i);
		}

		input.close();

	}

}
