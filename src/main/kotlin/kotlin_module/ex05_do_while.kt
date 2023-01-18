package kotlin_module

import java.lang.Math.random

/*****
 *  1~10까지 숫자 중, 랜덤 숫자를 골라 숫자를 맞출 때 까지 계속 입력을 받는 프로그램을 완성하세요.
 */

fun main() {
    val a : Int = (1..10).random()
    do {
        val b = readln().toInt()
        if (a != b) print("오답")
    } while (a != b)
    print("정답")
}