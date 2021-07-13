package one.digitalinnovation.digionebank.testes
import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val SOMA:Int

    SOMA = calculate(a, b,::sum)
    println("SOMA = " + SOMA)
}

fun sum(a:Int, b:Int) = a.plus(b)

fun calculate(n1:Int, n2:Int, operation:(Int, Int)->Int):Int{
    val result = operation(n1,n2)
       return result
    }