package com.ch03;

public class ch03_08 {

	public static void main(String args[]) {

		// 8

		System.out.println(factorial(5));

	}

	static int factorial(int n) {

		return switch (n) {
		case 1 -> 1;
		default -> n * factorial(n - 1);
		};

	}

}
