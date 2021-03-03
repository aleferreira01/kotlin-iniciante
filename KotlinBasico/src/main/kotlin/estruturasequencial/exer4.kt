/* Faça um Programa que peça as 4 notas bimestrais e mostre a média. */

package estruturasequencial

import java.util.Scanner

fun main(){

    /*val notaBimestral1:Double
    val notaBimestral2:Double
    val notaBimestral3:Double
    val notaBimestral4:Double
    val media:Double*/
    val notasBimestrais = Array(4){0.0}

    var media = 0.0
    val reader = Scanner (System.`in`)

    println("Entre com as 4 notas bimestrais para calcular a média:")

    for(i in notasBimestrais.indices){
        notasBimestrais[i] = reader.nextDouble()
        media += notasBimestrais[i]
    }

    //media = ((notaBimestral1 + notaBimestral2 + notaBimestral3 + notaBimestral4) / 4)
    media /= 4

    println("Média: $media")
}


