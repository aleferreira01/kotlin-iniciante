/* Faça um Programa que leia três números e mostre o maior e o menor
deles. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Digite o primeiro valor: ")
    val valor1:Int = reader.nextInt()

    println("Digite o segundo valor: ")
    val valor2:Int = reader.nextInt()

    println("Digite o terceiro valor: ")
    val valor3:Int = reader.nextInt()

    val maiorValor = when {
        (valor1 >= valor2) && (valor1 >= valor3) -> valor1
        (valor2 >= valor1) && (valor2 >= valor3) -> valor2
        else -> valor3
    }

    println("Maior valor: $maiorValor")

    val menorValor = when {
        (valor1 <= valor2) && (valor1 <= valor3) -> valor1
        (valor2 <= valor1) && (valor2 <= valor3) -> valor2
        else -> valor3
    }

    println("Menor valor: $menorValor")

}