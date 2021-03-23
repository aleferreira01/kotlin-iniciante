/* Exercício feito com condicionais sem estrutura de repetição ou array */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Responda as perguntas com [S] para Sim e [N] para Não.")

    print("Telefonou para a vítima?: ")
    val resposta1:Char = reader.next()[0].toLowerCase()

    print("Esteve no local do crime?: ")
    val resposta2:Char = reader.next()[0].toLowerCase()

    print("Mora perto da vítima?: ")
    val resposta3:Char = reader.next()[0].toLowerCase()

    print("Devia para a vítima?: ")
    val resposta4:Char = reader.next()[0].toLowerCase()

    print("Já trabalhou com a vítima?: ")
    val resposta5:Char = reader.next()[0].toLowerCase()

    println("-----------------")

    var qtdCrimes = 0

    if ((resposta1 == 's' || resposta1 == 'n') && (resposta2 == 's' || resposta2 == 'n') &&
        (resposta3 == 's' || resposta3 == 'n') && (resposta4 == 's' || resposta4 == 'n') &&
        (resposta5 == 's' || resposta5 == 'n'))
    {
        if (resposta1 == 's') qtdCrimes++
        if (resposta2 == 's') qtdCrimes++
        if (resposta3 == 's') qtdCrimes++
        if (resposta4 == 's') qtdCrimes++
        if (resposta5 == 's') qtdCrimes++

        when (qtdCrimes) {
            2 -> println("Suspeita")
            in 3..4 -> println("Cúmplice")
            5 -> println("Assassino")
            else -> println("Inocente")
        }
    }
    else {
        println("\nHouve(ram) resposta(s) inválida(s) para a(s) pergunta(s)")
    }


}