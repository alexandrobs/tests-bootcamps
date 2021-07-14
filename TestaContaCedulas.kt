package one.digitalinnovation.digionebank.testes

import java.util.Scanner

fun main() {
    contaCedulas()
}

fun contaCedulas(){
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val cem: Int = a / 100
    val restoCem: Int = a - (cem * 100)
    val cinquenta: Int =  restoCem / 50
    val resto1: Int = (cem * 100) + (cinquenta * 50)
    val restoVinte = a - resto1
    val vinte: Int = restoVinte / 20
    val resto2: Int = (cem * 100) + (cinquenta * 50) + (vinte * 20)
    val restoDez: Int = a - resto2
    val dez: Int = restoDez / 10
    val resto3: Int = (cem * 100) + (cinquenta * 50) + (vinte * 20) + (dez * 10)
    val restoCinco: Int = a - resto3
    val cinco: Int = restoCinco / 5
    val resto4: Int = (cem * 100) + (cinquenta * 50) + (vinte * 20) + (dez * 10) + (cinco * 5)
    val restoDois: Int = a - resto4
    val dois: Int = restoDois / 2
    val resto5: Int = (cem * 100) + (cinquenta * 50) + (vinte * 20) + (dez * 10) + (cinco * 5) + (dois * 2)
    val restoUm: Int = a - resto5
    val um: Int = restoUm / 1
    println(a)
    println("$cem nota(s) de R$ 100,00")
    println("$cinquenta nota(s) de R$ 50,00")
    println("$vinte nota(s) de R$ 20,00")
    println("$dez nota(s) de R$ 10,00")
    println("$cinco nota(s) de R$ 5,00")
    println("$dois nota(s) de R$ 2,00")
    println("$um nota(s) de R$ 1,00")
}