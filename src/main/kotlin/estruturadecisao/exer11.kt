package estruturadecisao

import java.util.*

fun main() {

    //val percentual:Int
    val reader = Scanner (System.`in`)

    println("Entre com o valor do seu salário: ")
    val salario:Double = reader.nextDouble()

    val percentual:Int = when {
        salario <= 280 ->  20
        salario > 280 && salario < 700 -> 15
        salario >= 700 && salario < 1500 -> 10
        else -> 5
    }

    val aumento:Double = (salario * percentual) / 100
    val novoSalario:Double = salario + aumento

    println("\nSalário antes do reajuste: R$ "+ "%.2f".format(salario))
    println("Percentual de aumento: $percentual%")
    println("Valor do aumento: R$ "+ "%.2f".format(aumento))
    println("Novo salário: R$ " + "%.2f".format(novoSalario))

}