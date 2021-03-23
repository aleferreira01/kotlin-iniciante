package estruturadecisao

import java.util.*

fun main() {

    val reader = Scanner (System.`in`)

    println("Digite o primeiro valor: ")
    val valor1:Int = reader.nextInt()

    println("Digite o segundo valor: ")
    val valor2:Int = reader.nextInt()

    println("Escolha a operação de cálculo desejada.")
    println("[+] - Adição")
    println("[-] - Subtração")
    println("[*] - Multiplicação")
    println("[/] - Divisão")
    print("Operação: ")
    val operacao:Char = reader.next()[0]

    var resultado = 0
    var opcaoInvalida = false

    when (operacao){

        '+' -> resultado = valor1 + valor2
        '-' -> resultado = valor1 - valor2
        '*' -> resultado = valor1 * valor2
        '/' -> resultado = valor1 / valor2
        else -> {
            println("Operação inválida")
            opcaoInvalida = true
        }
    }

    if (!opcaoInvalida){

        val mod = resultado % 2

        val frase1 = when {
            mod.equals(0) -> "par"
            else -> "ímpar"
        }

        val frase2 = when{
            resultado >= 0 -> "positivo"
            else -> "negativo"
        }

        println("\nO resultado é $resultado\n$resultado é $frase1 e $frase2")

    }

}