package kotlin_module

/*****
 * 화면에 숫자 k를 입력받아 k, k+2, k+4, k+6, k+8 출력하는 코드를 완성하세요.
 */
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt();

    for(i in 0 until x) {
       println(x +  2 * i)
    }
}