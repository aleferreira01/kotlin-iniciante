/* Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área. */

package estruturasequencial

import java.util.Scanner


fun main() {

    val raio:Double
    val reader = Scanner (System.`in`)

    print("Digite o valor do raio do círculo: ")
    raio = reader.nextDouble()

    val area:Double = Math.PI * Math.pow(raio, 2.0)

    println("Área do círculo: ${"%.2f".format(area)} m²")

}