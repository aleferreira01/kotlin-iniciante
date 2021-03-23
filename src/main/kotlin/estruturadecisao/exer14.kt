package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Entre com uma nota parcial do semestre: ")
    val nota1: Double = reader.nextDouble()

    println("Entre com outra nota parcial do semestre: ")
    val nota2: Double = reader.nextDouble()

    val media = (nota1 + nota2) / 2

    val conceito:Char = when {
        media in 9.0..10.0 -> 'A'
        media >= 7.5 && media < 9 -> 'B'
        media >= 6 && media < 7.5 -> 'C'
        media >=4 && media < 6 -> 'D'
        else -> 'E'
    }

    println("\n1ª Nota: $nota1")
    println("2ª Nota: $nota2")
    println("Média: $media")
    println("Conceito: $conceito")

    when (conceito) {
        'A','B','C' -> println("APROVADO")
        'D','E' -> println("REPROVADO")
    }


}