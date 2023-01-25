package kotlin_module

import java.util.*

/*****
 *  1~100까지 숫자를 랜덤수로 저장한 후,
 *	내가 숫자를 입력하면 더 큰 수인지, 더 작은 수인지 출력해서
 *	랜덤수를 맞추는 게임을 완성하세요.
 *
 *	※ 정답을 맞춘 후, 정답과 시도한 횟수를 같이 출력하시오.
 *
 *	(실행예제)
 *
 *	# (1번째 시도) 랜덤수는 무엇일까요?
 *	> 3
 *	# 틀렸습니다. 더 큰 수를 입력하세요.
 *	# (2번째 시도) 랜덤수는 무엇일까요?
 *	> 7
 *	# 틀렸습니다. 더 작은 수를 입력하세요.
 *	# (3번째 시도) 랜덤수는 무엇일까요?
 *	> 5
 *	# 정답입니다. 3번만에 맞추셨네요~~!!
 */

fun main() {
    val rnd = Random()
    val guess = rnd.nextInt(100) + 1
    val sc = Scanner(System.`in`)
    var trial = 1

    while (true) {
        val msg = ("(" + trial + "번째 시도)"
                + "랜덤숫자(1~100)는 무엇일까요?")
        print(msg)
        val input = sc.nextInt()
        if (guess == input) {
            println("정답입니다. " + trial + "번만에 맞추셨어요!")
            break
        } else if (guess > input) {
            println("틀렸습니다. 더 큰 숫자를 입력하세요!")
        } else if (guess < input) {
            println("틀렸습니다. 더 작은 숫자를 입력하세요!")
        }
        trial++
    }
}