/* Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.*/

package estruturasequencial

import java.util.*

fun main() {

    val grausFarenheit:Double
    val grausCelsius:Double

    val reader = Scanner (System.`in`)

    print("Digite a temperatura em graus Celsius que deseja converter para Farenheit: ")
    grausCelsius = reader.nextDouble()

    grausFarenheit = ((grausCelsius * 9 / 5) + 32)

    println("Graus Farenheit: ${"%.2f".format(grausFarenheit)} ºF")


}