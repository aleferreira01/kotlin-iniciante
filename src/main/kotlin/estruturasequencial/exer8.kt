/* Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês. */

package estruturasequencial

import java.util.*

fun main() {

    val salarioPorHora:Double
    val horasTrabalhadas:Int
    val reader = Scanner (System.`in`)

    print("Digite o valor de salário que recebe por hora: R$ ")
    salarioPorHora = reader.nextDouble()

    print("Digite a quantidade de horas trabalhadas no mês: ")
    horasTrabalhadas = reader.nextInt()

    val salarioMes:Double = salarioPorHora * horasTrabalhadas

    println("Salário total do mês: R$ $salarioMes")



}