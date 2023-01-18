package java_module.ex04_input_value;

/*****
 * 화면에 숫자 k를 입력받아 k, k+2, k+4, k+6, k+8 출력하는 코드를 완성하세요.
 */
import java.util.Scanner;
public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = 0;
		for(int i = 0; i < k; i++) {
			System.out.println(k + x);
			x += 2;
		}
	}
}
