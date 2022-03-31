package com.ch02;

import java.util.Scanner;

public class ch02_3 {

	public static void main(String args[]) {

		// 3
		Scanner input = new Scanner(System.in);

		int R, H;
		float Pi = 3.14f;

		System.out.print("원기둥의 밑면 반지름은?: ");
		R = input.nextInt();

		System.out.print("원기둥의 높이는?: ");
		H = input.nextInt();

		System.out.printf("원기둥의 부피는 %.2f\n", R * R * H * Pi);

		input.close();

	}

}
