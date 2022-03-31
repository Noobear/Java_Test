package com.ch02;

import java.util.Scanner;

public class ch02_9 {

	public static void main(String args[]) {

		// 9
		Scanner input = new Scanner(System.in);

		int ma, ge, lib, hap;
		boolean one, two, dut;

		System.out.print("전공 이수 학점 : ");
		ma = input.nextInt();
		System.out.print("교양 이수 학점 : ");
		ge = input.nextInt();
		System.out.print("일반 이수 학점 : ");
		lib = input.nextInt();

		hap = ma + ge + lib;
		one = (ma >= 70);
		two = (ge >= 30 && lib >= 30) || (ge + lib >= 80);
		dut = hap >= 140;

		if (one == true && two == true && dut == true) {
			System.out.println("졸업 가능");
		} else {
			System.out.println("졸업 불가능");
		}

		input.close();

	}

}
