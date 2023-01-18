package java_module.ex03_array;

/****
 * 정수배열  2,3,5,6,9 를  만들고, 짝수만 출력하는 모듈을 만드시오.
 */

public class Main3 {
	public static void main(String[] args) {
		int[] list = {2,3,5,6,9};

		for(int i : list) {
			if(i%2 == 0) {
				System.out.print(i);
			}
		}
	}
}
