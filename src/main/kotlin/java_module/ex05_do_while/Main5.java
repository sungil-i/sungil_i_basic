package java_module.ex05_do_while;

/*****
 *  1~10까지 숫자 중, 랜덤 숫자를 골라 숫자를 맞출 때 까지 계속 입력을 받는 프로그램을 완성하세요.
 */
import java.util.*;
public class Main5 {
	public static void main(String[] args) {
		// 랜덤수 생성하기
		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
		int ranNum = rnd.nextInt(10)+1;

		// 숫자를 맞출때까지 무한 루프 돌기
		while(true) {
			int myNum = scn.nextInt();
			if(ranNum == myNum) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("틀렸습니다!!");
			}
		}
	}
}
