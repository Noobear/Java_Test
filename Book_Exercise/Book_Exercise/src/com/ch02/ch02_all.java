package com.ch02;

import java.util.Scanner;

public class ch02_all {

	/*
	 * 78페이지 14번 public static void main(String args[]) {
	 * 
	 * 
	 * // pg.78 - 14 int x = 1, y = 2; System.out.println(x++);
	 * System.out.println("x = " + x + ", y = " + y); System.out.println(++x + y--);
	 * System.out.println("x = " + x + ", y = " + y);
	 * System.out.printf("%d / 3 + %d * %d = %d\n", ++x, x, ++y, x / 3 + x * y);
	 * System.out.println("x = " + x + ", y = " + y);
	 * 
	 * }
	 */

	/*
	 * 78페이지 15번 public static void main(String args[]) {
	 * 
	 * int x = 100;
	 * 
	 * System.out.println(x + "부터" + 200); System.out.println(x + 100 + " 년 전");
	 * System.out.println("200" + "100" + " 어이쿠!");
	 * 
	 * }
	 */

	/*
	 * 79페이지 16번 public static void main(String args[]) {
	 * 
	 * int i1 = 0x11, i2 = 5; final int ONE = 1; char c1 = 'a'; float f1 = 1.5f;
	 * double d1 = 2.8; boolean b1 = true; System.out.printf("i1 = %d\n", i1);
	 * System.out.printf("i1/2 = %d\n", i1 / 2); System.out.println("c1 + ONE = " +
	 * c1 + ONE); System.out.println("(int)c1 + ONE = " + (int) c1 + ONE);
	 * System.out.printf("(c1 + ONE) = %d\n", c1 + ONE);
	 * System.out.printf("(c1 + ONE) = %c\n", c1 + ONE);
	 * System.out.printf("(c1 + ONE) = %5s\n", c1 + ONE);
	 * System.out.printf("i2 + f1 = %f\n", i2 + f1);
	 * System.out.printf("f1 + d1 = %.1f\n", f1 + d1);
	 * System.out.printf("(int)(f1 + d1) = %d\n", (int) (f1 + d1));
	 * System.out.printf("(int)f1 + int(d1) = %d\n", (int) f1 + (int) d1);
	 * System.out.print("b1 = " + b1);
	 * 
	 * }
	 */

	public static void main(String args[]) {

		// 1
		System.out.println("     *");
		System.out.println("    ***");
		System.out.println("   *****");
		System.out.println("  *******");
		System.out.println(" *********");
		System.out.println("***********");

		// 2
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("정수를 입력하세요 : ");
		n = input.nextInt();
		System.out.printf("%d의 제곱은 = %d\n", n, n * n);

		// 3
		int R, H;
		float Pi = 3.14f;
		System.out.print("원기둥의 밑면 반지름은?: ");
		R = input.nextInt();
		System.out.print("원기둥의 높이는?: ");
		H = input.nextInt();
		System.out.printf("원기둥의 부피는 %.1f\n", R * R * H * Pi);

		// 4
		int h, m, s;
		System.out.print("초 단위 정수를 입력하세요 : ");
		s = input.nextInt();
		h = s / 3600;
		s = s - 3600 * h;
		m = s / 60;
		s = s - m * 60;
		System.out.printf("%d시간 %d분 %d초\n", h, m, s);

		// 5
		char c = 'c';
		System.out.printf("%c\n", (int) c + (int) 'A' - (int) 'a');

		// 6
		float f, cel;
		System.out.print("화씨 온도(F) : ");
		f = input.nextFloat();
		cel = (5 * (f - 32) / 9);
		System.out.printf("섭씨 온도(C) = %.3f\n", cel);

		// 7
		int x;
		System.out.print("정수를 입력하세요 : ");
		x = input.nextInt();
		boolean fo, fi;
		fo = x % 4 == 0;
		fi = x % 5 == 0;
		System.out.print("4와 5로 나누어지는가? - " + (fo & fi) + '\n');
		System.out.print("4 또는 5로 나누어지는가? - " + (fo | fi) + '\n');
		System.out.print("4 또는 5로 나누어지지만 두 수 모두로는 나누어지지 않는가? -" + ((fo | fi) & (fo ^ fi)) + '\n');

		// 8

		// 9

		input.close();

	}

}
