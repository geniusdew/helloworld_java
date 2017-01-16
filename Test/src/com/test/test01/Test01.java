package com.test.test01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int num;
		while (flag) {
			System.out.println("1 ~ 4의 숫자를 입력하세요.");
			num = sc.nextInt();
			if (num == 1) {
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

			} else if (num == 2) {
				for (int i = 0; i < 5; i++) {
					for (int j = 5; j > i; j--) {
						System.out.print(" ");
					}
					for (int k = 0; k < i + 1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}

			} else if (num == 3) {
				for (int i = 0; i < 5; i++) {
					for (int k = 0; k < i + 1; k++) {
						System.out.print(" ");
					}
					for (int j = 5; j > i; j--) {

						System.out.print("*");
					}
					System.out.println();
				}
			} else if (num == 4) {
				for (int i = 0; i < 5; i++) {
					for (int j = 5; j > i; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
			} else {
				System.out.println("잘못된 입력!");
			}
			System.out.println("계속 진행하겠습니까(Yes : 1 /No : 2)");
			num = sc.nextInt();
			if (num == 2) {
				flag = false;
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Bye!");

	}
}
