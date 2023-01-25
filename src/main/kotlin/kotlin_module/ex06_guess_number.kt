package kotlin_module

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
import java.util.*

fun main() {
    val rnd = Random()
    val guess = rnd.nextInt(100) + 1
    val scn = Scanner(System.`in`)

    var trial = 1

    while (true) {
        val msg = ("(" + trial + "번쨰 시도)"
                + "랜덤 숫자 1~100")
        print(msg)
        val input = scn.nextInt()
        if (guess == input) {
            println("정답입니다." + trial + "번만에 맞추셨습니다.")
            break
        } else if (guess > input) {
            println("틀리셨습니다.")
        } else if (guess < input) {
            println("정답")
        }
        trial++
    }
}