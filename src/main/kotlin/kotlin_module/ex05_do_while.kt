package kotlin_module

import java.util.Scanner
import kotlin.random.Random

/*****
 *  1~10까지 숫자 중, 랜덤 숫자를 골라 숫자를 맞출 때 까지 계속 입력을 받는 프로그램을 완성하세요.
 */

fun main() {
    var r = Random.nextInt(10)+1
    var sc = Scanner(System.`in`)

    while (true){
        var num = sc.nextInt()
        if (r == num){
            println("정답")
            break
        } else{
            println("땡")
        }
    }

}