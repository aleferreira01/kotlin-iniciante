package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Equação de 2º Grau")
    print("Entre com o valor de 'A': ")
    val a:Double = reader.nextDouble()

    if (a.equals(0.0)){
        println("\nNão é uma equação de segundo grau. \nNão foi possível realizar o cálculo")
    }
    else{
        print("Entre com o valor de 'B': ")
        val b:Double = reader.nextDouble()

        print("Entre com o valor de 'C': ")
        val c:Double = reader.nextDouble()

        val delta = (Math.pow(b, 2.0) - 4 * a * c)

        println("\nDelta: $delta")

        val raiz1:Double
        val raiz2:Double

        when {
            delta < 0 -> println("A equação não possui raízes. \n" +
                    "Não foi possível realizar o cálculo")

            delta.equals(0.0) -> {
                raiz1 = -b / (2 * a)

                println("A equação possui somente um raiz.")
                println("Raiz 1 igual a $raiz1")

            }

            else -> {
                raiz1 = (-b + (Math.sqrt(delta))) / (2 * a)
                raiz2 = (-b - (Math.sqrt(delta))) / (2 * a)

                println("A equação possui duas raízes.")
                println("Raiz 1 igual a $raiz1")
                println("Raiz 2 igual a $raiz2")

            }

        }

    }

}