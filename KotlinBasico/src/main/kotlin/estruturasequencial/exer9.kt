/* Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius. */

package estruturasequencial

import java.util.*

fun main() {
    val grausFarenheit:Double
    val grausCelsius:Double

    val reader = Scanner (System.`in`)

    print("Digite a temperatura em graus Farenheit que deseja converter para Celsius: ")
    grausFarenheit = reader.nextDouble()

    grausCelsius = (5 * (grausFarenheit - 32) / 9)

    println("Graus Celsius: ${"%.2f".format(grausCelsius)} ºC")

}