package one.digitalinnovation.digionebank.testes

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    fibo(n)
}

val fibo:(Int) -> Unit = { numero->

    var a = 1
    var b = 0
    var soma: Int
    val lista:MutableList<String> = mutableListOf("0")
    lista.add(" ")

    for (i in 0 until numero-1){
        lista.add(a.toString())
        lista.add(" ")
        soma = a
        a += b
        b = soma
    }

    lista.forEach { numeros-> print(numeros) }
}