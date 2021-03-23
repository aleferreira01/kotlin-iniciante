/*Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.*/

package estruturasequencial

import java.util.*

fun main() {

    val lado:Double
    val reader = Scanner (System.`in`)

    print("Digite o valor do lado do quadrado: ")
    lado = reader.nextDouble()

    val area:Double = lado * lado

    println("Área do quadrado: $area")
    println("Dobro da área do quadrado: " + (area * 2))

}