package kotlin_module

/*****
 * 화면에 숫자 k를 입력받아 k, k+2, k+4, k+6, k+8 출력하는 코드를 완성하세요.
 */
import java.util.Scanner
fun main() {
    val k:Int = readLine()!!.toInt()
    for (i in 0 .. 8 step 2) print("${k + i} ")
}