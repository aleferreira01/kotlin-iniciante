/*Faça um Programa que peça um número inteiro e determine se ele é
par ou impar.  */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Entre com um número inteiro: ")
    val valor:Int = reader.nextInt()

    if (valor % 2 == 0) println("O número $valor é par")
    else println("O número $valor é ímpar")

}