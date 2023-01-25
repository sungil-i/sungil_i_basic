package java_module.ex06_guess_number;

import java.util.Random;
import java.util.Scanner;

/*****
 *  1~100까지 숫자를 랜덤수로 저장한 후,
 *	내가 숫자를 입력하면 더 큰 수인지, 더 작은 수인지 출력해서
 *	랜덤수를 맞추는 게임을 완성하세요.
 *
 *	※ 정답을 맞춘 후, 정답과 시도한 횟수를 같이 출력하시오.
 *
 *	(실행예제)
 *
 *	# (1번째 시도) 랜덤수는 무엇일까요?
 *	> 3
 *	# 틀렸습니다. 더 큰 수를 입력하세요.
 *	# (2번째 시도) 랜덤수는 무엇일까요?
 *	> 7
 *	# 틀렸습니다. 더 작은 수를 입력하세요.
 *	# (3번째 시도) 랜덤수는 무엇일까요?
 *	> 5
 *	# 정답입니다. 3번만에 맞추셨네요~~!!
 */

public class Main6 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);

		int num = rnd.nextInt(100)+1;
		int cnt = 1;

		for (int i=0; i<20; i++) {
			System.out.println("("+cnt+"번째 시도) 랜덤 수는 무엇일까요?");
			int input = sc.nextInt();

			if (input == num) {
				System.out.println("정답입니다 "+cnt+"번만에 맞추셨네요");
				break;
			} else if (num > input ) {
				System.out.println("틀렸습니다. 더 큰 수를 입력하세요");
			} else if(num < input) {
				System.out.println("틀렸습니다. 더 작은 수를 입력하세요");
			}
			cnt++;
		}
	}
}
