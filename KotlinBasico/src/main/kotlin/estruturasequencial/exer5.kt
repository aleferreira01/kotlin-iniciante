/* Faça um Programa que converta metros para centímetros. */

package estruturasequencial

import java.util.Scanner

fun main(){

    val metro:Double
    val reader = Scanner (System.`in`)

    print("Entre com o valor (metros): ")
    metro = reader.nextDouble()

    println("Centímetro(s): " + (metro * 100) + " cm")


}