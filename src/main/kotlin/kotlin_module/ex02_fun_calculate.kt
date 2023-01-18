package kotlin_module

import java_module.ex02_fun_calculate.Main2.getDivide

fun main() {
	val a: Int = 4
	val b: Int = 3
	println("$a + $b = ${getPlus(a, b)}")
	println("$a - $b = ${getMinus(a, b)}")
	println("$a * $b = ${getMulti(a, b)}")
	println("$a / $b = ${getDivide(a, b)}")
}

fun getPlus(i1: Int, i2: Int): Int = i1 + i2
fun getMinus(i1: Int, i2: Int): Int = i1 - i2
fun getMulti(i1: Int, i2: Int): Int = i1 * i2
fun getDivide(i1: Int, i2: Int): Float = i1.toFloat() / i2.toFloat()