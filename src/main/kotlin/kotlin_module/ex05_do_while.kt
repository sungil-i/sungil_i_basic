package kotlin_module

/*****
 *  1~10까지 숫자 중, 랜덤 숫자를 골라 숫자를 맞출 때 까지 계속 입력을 받는 프로그램을 완성하세요.
 */
import java.util.Scanner
import java.util.Random
fun main() {
    val sc = Scanner(System.`in`)
    val rnd = Random()
    val num = rnd.nextInt(10) + 1
    do {
        val input = sc.nextInt()
        if(input == num) break
        else println("다시입력하세요")
    } while(true)
}