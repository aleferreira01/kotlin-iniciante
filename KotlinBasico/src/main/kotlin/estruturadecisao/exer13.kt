/* Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Digite um valor de 1 à 7 correspondente ao dia da semana desejado: ")
    val diaSemana:Int = reader.nextInt()

    println()

    when (diaSemana){
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sábado")
        else -> println("Valor inválido")
    }

}