package kotlin_module

/*****
 * 화면에 숫자 k를 입력받아 k, k+2, k+4, k+6, k+8 출력하는 코드를 완성하세요.
 */

fun main() {
    var a : Int = readln().toInt()
    for (i in 1..5) {
        println(a)
        a = a+2*i
    }
}