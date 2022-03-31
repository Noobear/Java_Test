package com.ch03;

public class ch03_05 {

	public static void main(String args[]) {

		// 5

		int a = 1, b = 1, c = 1;

		for (a = 1; a <= 20; a++) {
			for (b = 1; b <= 20; b++) {
				for (c = 1; c <= 20; c++) {
					if (c * c == b * b + a * a && a + b + c <= 20)
						System.out.printf("둘레가 20 이하인 직각삼각형의 각 변의 길이는 %d, %d, %d\n", c, a, b);

				}
			}
		}

	}

}
