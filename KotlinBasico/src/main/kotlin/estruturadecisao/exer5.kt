/*Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
- A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
- A mensagem "Reprovado", se a média for menor do que sete;
- A mensagem "Aprovado com Distinção", se a média for igual a
dez. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Entre com uma nota parcial")
    val nota1:Double = reader.nextDouble()

    println("Entre com outra nota parcial")
    val nota2:Double = reader.nextDouble()

    val media = (nota1 + nota2) / 2

    println("Média: $media")

    when{
        media >= 7 && media < 10 -> println("Aprovado")
        media < 7 -> println("Reprovado")
        media.equals(10.0)-> println("Aprovado com Distinção")
    }

}


