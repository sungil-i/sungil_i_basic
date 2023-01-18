package kotlin_module

/****
 * 정수배열  2,3,5,6,9 를  만들고, 짝수만 출력하는 모듈을 만드시오.
 */

fun main() {
    val list = listOf(2,3,5,6,9)
    for(i in list) {
        if (i % 2 ==0) {
            print(i)
        }
    }
}