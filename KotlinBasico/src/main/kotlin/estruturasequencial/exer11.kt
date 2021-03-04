/* Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo. */

package estruturasequencial

import java.util.*
import kotlin.math.pow

fun main() {

    val valor1:Int
    val valor2:Int
    val valor3:Double

    val reader = Scanner (System.`in`)

    println("Digite o primeiro valor: ")
    valor1 = reader.nextInt()

    println("Digite o segundo valor: ")
    valor2 = reader.nextInt()

    println("Digite o terceiro valor: ")
    valor3 = reader.nextDouble()

    val resultado1 = ((valor1 * 2) * (valor2 / 2))
    println("Produto do dobro do primeiro com metade do segundo: $resultado1")

    val resultado2 = ((valor1 * 3) + valor3)
    println("A soma do triplo do primeiro com o terceiro: $resultado2")

    val resultado3 = valor3.pow(3)
    println("O terceiro elevado ao cubo: $resultado3")

}