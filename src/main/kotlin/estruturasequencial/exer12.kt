/* Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58 */

package estruturasequencial

import java.util.*

fun main() {

    val altura:Double
    val reader = Scanner (System.`in`)

    println("Digite a sua altura: ")
    altura = reader.nextDouble()

    val pesoIdeal = ((72.7 * altura) - 58)

    println("Peso ideal: ${"%.2f".format(pesoIdeal)} Kg")

}