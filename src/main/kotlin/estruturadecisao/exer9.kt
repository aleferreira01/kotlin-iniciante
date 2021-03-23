/* Faça um Programa que leia três números e mostre-os em ordem
decrescente. */

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

    //Maior valor na ordem decrescente
    val maiorValor = when {
        (valor1 >= valor2) && (valor1 >= valor3) -> valor1
        (valor2 >= valor1) && (valor2 >= valor3) -> valor2
        else -> valor3
    }

    //Menor valor na ordem decrescente
    val menorValor = when {
        (valor1 <= valor2) && (valor1 <= valor3) -> valor1
        (valor2 <= valor1) && (valor2 <= valor3) -> valor2
        else -> valor3
    }

    //Meio valor na ordem decrescente (6 possibilidades)
    val meioValor = when {
        (maiorValor == valor1) && (menorValor == valor2) -> valor3
        (maiorValor == valor1) && (menorValor == valor3) -> valor2
        (maiorValor == valor2) && (menorValor == valor1) -> valor3
        (maiorValor == valor2) && (menorValor == valor3) -> valor1
        (maiorValor == valor3) && (menorValor == valor1) -> valor2
        else -> valor1
    }

    println("\nOrdem decrescente dos valores: ")
    println("$maiorValor \n$meioValor \n$menorValor")

}