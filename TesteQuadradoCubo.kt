package one.digitalinnovation.collections

import java.util.Scanner

fun main(args: Array<String>) {

    val readLine = Scanner(System.`in`)
    val a:Int = readLine.nextInt()

    imprimeNumeroLinhas(a)
}

fun imprimeNumeroLinhas(num:Int){
    for (i in 1..num) {
        print(i)
        print(" "+ i * i)
        print(" "+ i * i * i)
        println()
    }
}

fun imprimeNumeroAoQuadrado(num:Int){
    for (i in 1..num) {
        print(" "+ i * i)
        println()
    }
}

fun imprimeNumeroAoCubo(num:Int){
    for (i in 1..num) {
        print("  "+ i * i * i)
        println()
    }
}