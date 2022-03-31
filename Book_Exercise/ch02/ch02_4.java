package com.ch02;

import java.util.Scanner;

public class ch02_4 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		// 4
		int h, m, s;
		System.out.print("초 단위 정수를 입력하세요 : ");
		s = input.nextInt();
		h = s / 3600;
		s = s - 3600 * h;
		m = s / 60;
		s = s - m * 60;
		System.out.printf("%d시간 %d분 %d초\n", h, m, s);

		input.close();

	}

}
