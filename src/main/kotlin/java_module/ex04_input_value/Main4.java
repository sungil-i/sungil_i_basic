package java_module.ex04_input_value;

import java.util.Scanner;

/*****
 * 화면에 숫자 k를 입력받아 k, k+2, k+4, k+6, k+8 출력하는 코드를 완성하세요.
 */

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		System.out.println(k);
		System.out.println(k+2);
		System.out.println(k+4);
		System.out.println(k+6);
		System.out.println(k+8);
	}
}
