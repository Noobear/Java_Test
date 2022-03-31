package com.ch03;

import java.util.Scanner;

public class ch03_03 {

	public static void main(String args[]) {

		// 3
		Scanner input = new Scanner(System.in);

		int num;
		int hap = 0;

		do {
			System.out.print("양의 정수를 입력하세요 : ");
			num = input.nextInt();
			if (num % 2 == 0) {
				if (num > 0)
					hap += num;
			}

		} while (num > 0);

		System.out.printf("입력한 양의 정수 중에서 짝수의 합은 %d", hap);

		input.close();

	}

}
