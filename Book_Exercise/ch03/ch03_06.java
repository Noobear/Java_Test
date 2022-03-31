package com.ch03;

import java.util.Scanner;

public class ch03_06 {

	public static void main(String args[]) {

		// 6
		Scanner sc = new Scanner(System.in);

		System.out.print("철수 : ");
		String c = sc.next();

		System.out.print("영희 : ");
		String y = sc.next();

		System.out.printf("young : %s, chul : %s", y, c);

		sc.close();
	}

}
