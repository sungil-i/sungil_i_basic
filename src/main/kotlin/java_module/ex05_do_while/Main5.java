package java_module.ex05_do_while;

import java.util.Random;
import java.util.Scanner;

/*****
 *  1~10까지 숫자 중, 랜덤 숫자를 골라 숫자를 맞출 때 까지 계속 입력을 받는 프로그램을 완성하세요.
 */

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int rnd = ran.nextInt(10)+1;
		int i = 0;

		do {
			System.out.println("입력해주세요");
			i = sc.nextInt();
		} while (i != rnd);
		System.out.println("정답입니다. 정답은"+rnd+"입니다.");
	}
}
