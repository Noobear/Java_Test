package com.ch03;

import java.util.Scanner;

public class ch03_02 {

	public static void main(String args[]) {

		// 2
		Scanner input = new Scanner(System.in);
		System.out.print("등수를 입력하세요. : ");
		int rank = input.nextInt();

		switch (rank) {
		case 1:
			System.out.print("아주 잘했습니다.");
			break;
		case 2, 3:
			System.out.print("잘했습니다.");
			break;
		case 4, 5, 6:
			System.out.print("보통입니다.");
			break;
		default:
			System.out.print("노력해야겠습니다.");
		}

		input.close();

	}
}
