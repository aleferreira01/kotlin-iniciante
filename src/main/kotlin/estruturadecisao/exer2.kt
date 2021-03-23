/* Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Entre com um número inteiro: ")
    val valor:Int = reader.nextInt()

    if (valor >= 0){
        println("O número $valor é positivo")
    }
    else{
        println("O número $valor é negativo")
    }
}