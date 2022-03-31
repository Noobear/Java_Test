package com.ch02;

import java.util.Scanner;

public class ch02_8 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		// 8
		int k, i, s, t, hap;
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		k = input.nextInt();
		t = k % 10; // 1의 자리수 (3번째 위치--third)
		i = k / 100; // 100의 자리수 (1번째 위치--initial)
		s = (k - i * 100) / 10; // (10의 자릿수 (2번째 위치 -- second)
		hap = i + s + t;
		System.out.println("각 자릿수의 합 = " + hap);

		input.close();

	}

}
