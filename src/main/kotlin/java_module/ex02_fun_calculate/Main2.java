package java_module.ex02_fun_calculate;

public class Main2 {
	public static void main(String[] args) {
		int a = 4;
		int b = 3;

		System.out.println(getPlus(a, b));
		System.out.println(getMinus(a, b));
		System.out.println(getMulti(a, b));
		System.out.println(getDivide(a, b));
	}

	public static int getPlus(int a, int b) {
		return a + b;
	}

	public static int getMinus(int a, int b) {
		return a - b;
	}

	public static int getMulti(int a, int b) {
		return a * b;
	}

	public static float getDivide(int a, int b) {
		return (float) a / (float) b;
	}
}
