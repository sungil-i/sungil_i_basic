package java_module.ex04_input_value;

import java.util.Scanner;

/*****
 * 화면에 숫자 k를 입력받아 k, k+2, k+4, k+6, k+8 출력하는 코드를 완성하세요.
 */

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for(int i=0; i<5; i++) {
			System.out.println(a+2*i);
		}
	}
}
