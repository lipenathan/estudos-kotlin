package org.example

import org.example.orientacaoaobjetos.Conta
import org.example.orientacaoaobjetos.Endereco

fun main() {

    //region fundamentos
    val numero: Int
    numero = 10
//    numero = 20 val não pode ser alterado

    var segundoNumero = 100

    val resultado = numero + segundoNumero

    println("O resutldado de $numero + $segundoNumero é $resultado")

    somarDoisNumeros(500, 600)

    val resultado2 = somarDoisNumerosEDobrar(100, 100)

    println(resultado2)
    println(somarDoisNumerosEDobrar(100, 100))//também funciona
    //função com parâmetro padrão

    val resutado3 = somarDoisNumerosERetorna(10)

    println("Resultado 3 $resutado3")
    println("Fim dos fundamentos\n\n\n")
    //endregion

    //region poo

    val conta = Conta()

    //conta.nomeTitular = "Fulano de Tal" //não é possível setar o nome fora da classe conta
    conta.codigo = "1234-5"

    val endereco = Endereco("rua dos algoritmos", "jd bom código", "1000", "Londrina")

//    conta.endereco = endereco

//    println("O meu saldo é: R$ ${conta.saldo}" )Zeco?: Endereco("", "", "", "")).cidade}")

    val endereco2 = endereco

    println(endereco2.cidade)

    endereco.cidade = "Cambé"

    println(endereco2.cidade)

    println("conta 1 é igual a conta 2? ${endereco == endereco2}")

    //operadores de checagem de valor nulo
    //?
    //?:
    //!!
    println("Fim POO \n\n\n")

    //endregion

    //region coleções

    var listaDeInteiros = mutableListOf(1, 2, 3, 4, 5)

    var listaDeNomes = listOf("Luiz", "Pedro", "Augusto")

    listaDeInteiros.add(6)

    println(listaDeInteiros)

    println("Fim das coleções \n\n\n")

    //endregion

    //region condições

    val a = 100
    var b = 90

    var bMaiorQueA = if (b > a) "sim" else if (b == a) "é igual" else "não"

    when(b) {
        100 -> {
            println("A vale 100 companheiro")
        }
        50 -> println("A vale 50 companheiro")
        else -> println("A não foi o esperado")
    }



    //exemplo em Java
    //boolean bMaiorQueA = b > a? "sim": "nao"

    println(bMaiorQueA)
    println("Fim confições \n\n\n")
    //endregion

    //region controle de fluxo

    for (i in 0..10) { //incremento
        println(i)
    }

    for (i in 10 downTo 1) { //decremento
        println(i)
    }

    for (item in listaDeNomes) {
        println(item)
    }

    //endregion
}

fun somarDoisNumeros(a: Int, b: Int) {
    val resultado = a + b
    println(resultado)
}

fun somarDoisNumerosERetorna(a: Int, b: Int = 10): Int {
    return a + b
}

fun somarDoisNumerosEDobrar(a: Int, b: Int) = (a + b) * 2.0