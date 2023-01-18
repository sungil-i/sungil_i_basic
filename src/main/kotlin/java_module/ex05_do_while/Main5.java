package java_module.ex05_do_while;

import java.nio.file.LinkPermission;
import java.util.Random;
import java.util.Scanner;

/*****
 *  1~10까지 숫자 중, 랜덤 숫자를 골라 숫자를 맞출 때 까지 계속 입력을 받는 프로그램을 완성하세요.
 */

public class Main5 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(10)+1;

		Scanner sc = new Scanner(System.in);

		while (true){
			int input = sc.nextInt();
			if (num == input){
				System.out.println("정답");
				break;
			} else {
				System.out.println("떙");
			}
		}
	}
}
