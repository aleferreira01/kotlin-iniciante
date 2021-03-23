/* Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Entre com o valor do lado A do triângulo: ")
    val ladoA:Int = reader.nextInt()

    println("Entre com o valor do lado B do triângulo: ")
    val ladoB:Int = reader.nextInt()

    println("Entre com o valor do lado C do triângulo: ")
    val ladoC:Int = reader.nextInt()

    /* Três lados formam um triângulo quando a soma de quaisquer
    *  dois lados for maior que o terceiro */
    if(((ladoA + ladoB) > ladoC) || ((ladoA + ladoC) > ladoB) ||
        ((ladoB + ladoC) > ladoA)){

            println("\nOs valores dos lados formam um triângulo")

            when {
                ((ladoA == ladoB) && (ladoA == ladoC) && (ladoB == ladoC))
                        -> println("Triângulo equilátero")
                ((ladoA != ladoB) && (ladoA != ladoC) && (ladoC != ladoB))
                        -> println("Triângulo escaleno")
                ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC))
                        -> println("Triângulo isósceles")
            }
    }
    else{
        println("\nOs valores dos lados não formam um triângulo")
    }
}