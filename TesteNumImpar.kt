package one.digitalinnovation.collections

import java.util.Scanner

fun main(args: Array<String>) {

    val readLine = Scanner(System.`in`)
    val a:Int = readLine.nextInt()

    step(a)
}

fun step(num:Int){
    for (i in 1..num step(2)) println(i)
}