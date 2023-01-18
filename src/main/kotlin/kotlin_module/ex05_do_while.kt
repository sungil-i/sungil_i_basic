package kotlin_module

import java.util.*

/*****
 *  1~10까지 숫자 중, 랜덤 숫자를 골라 숫자를 맞출 때 까지 계속 입력을 받는 프로그램을 완성하세요.
 */

fun main() {
    val sc = Scanner(System.`in`)
    val ran = Random()
    val rnd = ran.nextInt(10) + 1
    var i = 0

    do {
        println("입력해주세요")
        i = sc.nextInt()
    } while (i != rnd)
    println("정답입니다. 정답은" + rnd + "입니다.")
}