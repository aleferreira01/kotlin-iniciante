/*Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número]*/

package estruturasequencial

import java.util.Scanner

fun main(){

    val value:Int
    val reader = Scanner (System.`in`)

    print("Digite um número: ")
    value = reader.nextInt()

    println("O número informado foi $value")

}