/* Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Entre com o preço do produto A: ")
    val valor1:Double = reader.nextDouble()

    println("Entre com o preço do produto B: ")
    val valor2:Double = reader.nextDouble()

    println("Entre com o preço do produto C: ")
    val valor3:Double = reader.nextDouble()

    val precoBarato = when {
        (valor1 < valor2) && (valor1 < valor3) -> {
            println("\nVocê deve comprar o produto A")
            valor1
        }
        (valor2 < valor1) && (valor2 < valor3) -> {
            println("\nVocê deve comprar o produto B")
            valor2
        }
        else -> {
            println("\nVocê deve comprar o produto C")
            valor3
        }
    }

    println("Menor preço: $precoBarato")


}