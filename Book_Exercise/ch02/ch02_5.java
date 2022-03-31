package com.ch02;

import java.util.Scanner;

public class ch02_5 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		// 5
		System.out.print("소문자 입력 : ");
		char c = input.next().charAt(0);
		System.out.printf("대문자는 : %c\n", c + 'A' - 'a');

		input.close();

	}

}
