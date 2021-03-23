/* Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto. */

package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Entre com um ano desejado: ")
    val ano:Int = reader.nextInt()

    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
        println("O ano $ano é bissexto")
    }
    else{
        println("O ano $ano não é bissexto")
    }

}