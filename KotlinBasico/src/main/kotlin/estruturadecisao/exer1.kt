/* Faça um Programa que peça dois números e imprima o maior deles. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Entre com um número inteiro:")
    val valor1:Int = reader.nextInt()

    println("Entre com outro número inteiro:")
    val valor2:Int = reader.nextInt()

    val maiorValor = if (valor1 > valor2) valor1 else valor2

    println("Maior valor: $maiorValor")

}