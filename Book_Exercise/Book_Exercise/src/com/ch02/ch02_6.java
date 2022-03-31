package com.ch02;

import java.util.Scanner;

public class ch02_6 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		// 6
		float f, cel;
		System.out.print("화씨 온도(F) : ");
		f = input.nextFloat();
		cel = (5 * (f - 32) / 9);
		System.out.printf("섭씨 온도(C) = %.3f\n", cel);

		input.close();

	}

}
