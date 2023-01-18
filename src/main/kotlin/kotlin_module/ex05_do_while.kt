package kotlin_module

import java.util.Scanner
import kotlin.random.Random

/*****
 *  1~10까지 숫자 중, 랜덤 숫자를 골라 숫자를 맞출 때 까지
 *  계속 입력을 받는 프로그램을 완성하세요.
 */

fun main() {
    val a = Random.nextInt(10)+1
    val scn = Scanner(System.`in`)
    var c = true
    do{
        val b = scn.nextInt()
        if(a.equals(b)){
            println("정답")
            c = false
        }else{
            println("오답")
        }
    }while(c)
}