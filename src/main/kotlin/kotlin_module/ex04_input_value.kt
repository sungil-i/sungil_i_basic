package kotlin_module

/*****
 * 화면에 숫자 k를 입력받아 k, k+2, k+4, k+6, k+8 출력하는 코드를 완성하세요.
 */
import java.util.Scanner
fun main() {
    // 입력 받는 방법1
    val scn = Scanner(System.`in`)
    val a = scn.next().toInt()

    for (i in 1..4) {
        println(a+2*i)
    }
}