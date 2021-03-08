/* Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    print("Digite o seu sexo: \n" +
            "Tecle [M] para Masculino \n" +
            "Tecle [F] para Feminino \n" +
            "Opção desejada: ")

    when (Character.toUpperCase(reader.next()[0])){
        'M' -> println("M - Masculino")
        'F' -> println("F - Feminino")
        else -> println("Sexo inválido")
    }
}