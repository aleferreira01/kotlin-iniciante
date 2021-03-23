package estruturadecisao

import java.util.*

const val INSS = 10
const val FGTS = 11
const val SINDICATO = 3

fun main() {

    val reader = Scanner (System.`in`)

    println("Digite o valor da hora que recebe de salário: ")
    val salarioHora:Double = reader.nextDouble()

    println("Digite a quantidade de horas trabalhadas no mês: ")
    val quantidadeHoras:Int = reader.nextInt()

    val salarioBruto:Double = salarioHora * quantidadeHoras

    val aliquotaIR:Int = when {
        salarioBruto <= 900 -> 0
        salarioBruto > 900 && salarioBruto <= 1500 -> 5
        salarioBruto > 1500 && salarioBruto <= 2500 -> 10
        else -> 20
    }

    val ir = (salarioBruto * aliquotaIR) / 100
    //val sindicato = (salarioBruto * SINDICATO) / 100
    val inss = (salarioBruto * INSS) / 100
    val fgts = (salarioBruto * FGTS) / 100
    val descontos = ir + inss
    val liquido = salarioBruto - descontos

    println("\nSalário Bruto ($salarioHora * $quantidadeHoras): R$ " + "%.2f".format(salarioBruto))
    println("(-) IR ($aliquotaIR%): R$ " + "%.2f".format(ir))
    println("(-) INSS ($INSS%): R$ " + "%.2f".format(inss))
    println("FGTS ($FGTS%): R$ " + "%.2f".format(fgts))
    println("Total de descontos: R$ " + "%.2f".format(descontos))
    println("Salário Líquido: R$ " + "%.2f".format(liquido))

}