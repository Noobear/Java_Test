package com.ch02;

import java.util.Scanner;

public class ch02_7 {

	public static void main(String args[]) {

		// 7

		Scanner input = new Scanner(System.in);

		int x;

		System.out.print("정수를 입력하세요 : ");
		x = input.nextInt();

		boolean fo, fi;
		fo = x % 4 == 0;
		fi = x % 5 == 0;

		System.out.print("4와 5로 나누어지는가? - " + (fo & fi) + '\n');
		System.out.print("4 또는 5로 나누어지는가? - " + (fo | fi) + '\n');
		System.out.print("4 또는 5로 나누어지지만 두 수 모두로는 나누어지지 않는가? ");
		System.out.print("- " + ((fo | fi) & (fo ^ fi)) + '\n');

		input.close();
	}

}
