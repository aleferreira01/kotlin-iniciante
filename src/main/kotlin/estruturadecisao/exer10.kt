/* Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    print("Qual turno você estuda: \n" +
            "Tecle [M] para Matutino \n" +
            "Tecle [V] para Vespetino \n" +
            "Tecle [N] para Noturno \n" +
            "Opção desejada: ")

    when (Character.toUpperCase(reader.next()[0])){
        'M' -> println("\nBom dia!")
        'V' -> println("\nBoa Tarde!")
        'N' -> println("\nBoa Noite!")
        else -> println("\nOpção inválida")
    }
}