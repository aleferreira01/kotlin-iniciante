package estruturasequencial

import java.util.*

const val INSS = 8
const val IR = 11
const val SINDICATO = 5

fun main() {

    val salarioHora:Double
    val horasTrabalhadas:Int
    val reader = Scanner (System.`in`)

    println("Digite o valor do salário que recebe por hora: ")
    salarioHora = reader.nextDouble()

    println("Digite a quantidade de horas trabalhadas no mês: ")
    horasTrabalhadas = reader.nextInt()

    val salarioMes = salarioHora * horasTrabalhadas
    println("Salário do mês: R$ $salarioMes")

    val descontoINSS = ((salarioMes * INSS) / 100)
    val descontoSindicato = ((salarioMes * SINDICATO) / 100)
    val descontoIR = ((salarioMes * IR) / 100)
    val totalDescontos = descontoINSS + descontoSindicato + descontoIR
    val salarioLiquido = salarioMes - totalDescontos

    println()
    println("Salário Bruto: R$ $salarioMes")
    println("Valor pago ao INSS: R$ $descontoINSS")
    println("Valor pago ao IR: R$ $descontoIR")
    println("Valor pago ao Sindicato: R$ $descontoSindicato")
    println("Total de descontos: R$ $totalDescontos")
    println("Salário Líquido: R$ $salarioLiquido")

}