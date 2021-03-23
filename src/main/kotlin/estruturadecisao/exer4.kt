/* Faça um Programa que verifique se uma letra digitada é vogal ou
consoante. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Entre com uma letra: ")

    when(val letra:Char = Character.toUpperCase(reader.next()[0])){
        'A','E','I','O','U' -> println("A letra $letra é uma vogal")
        else -> println("A letra $letra é uma consoante")
    }

}