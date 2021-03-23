/* Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos). */

package estruturasequencial

import java.util.*

fun main() {

    val link:Double
    val arquivo:Double

    val reader = Scanner (System.`in`)

    println("Digite o tamanho em MB de um arquivo para download: ")
    arquivo = reader.nextDouble()

    println("Digite a velocidade em Mbps de um link de internet: ")
    link = reader.nextDouble()

    val tempo = arquivo / link

    println("Tempo de download: $tempo")
}