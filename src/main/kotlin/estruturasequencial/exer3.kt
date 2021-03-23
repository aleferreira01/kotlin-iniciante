/* Faça um Programa que peça dois números e imprima a soma. */

package estruturasequencial

import java.util.Scanner

fun main(){

    val value1:Int
    val value2:Int
    val reader = Scanner(System.`in`)

    println("Digite o primeiro valor da soma: ")
    value1 = reader.nextInt()
    println("Digite o segundo valor da soma: ")
    value2 = reader.nextInt()

    println("Soma: " + (value1 + value2))





}