package one.digitalinnovation.digionebank.testes

import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()
    val PROD = a * b

    println("PROD = $PROD")

}