package com.ch02;

import java.util.Scanner;

public class ch02_2 {

	public static void main(String args[]) {

		// 2
		Scanner input = new Scanner(System.in);

		int n;
		System.out.print("정수를 입력하세요 : ");
		n = input.nextInt();

		System.out.printf("%d의 제곱은 = %d\n", n, n * n);

		input.close();

	}

}
