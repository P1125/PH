package iteration;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		boolean run = true;
		// 런이라는 초기값

		int balance = 0;
		// 첫번째값을 넣는다고 초기화 /while 무한반복하겠다 (처리안할시)
		while (run) {

			System.out.println("----");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("----");
			System.out.print("선택>");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("예금액>");
				balance += scn.nextInt();
			} else if (menu == 2) {
				System.out.print("출금액>");
				balance -= scn.nextInt();
			} else if (menu == 3) {
				System.out.println("잔고>" + balance);
			} else if (menu == 4) {
				run = false;
			}

		} // end of while
		System.out.println("프로그램종료");
	} // end of main

} // end of class
