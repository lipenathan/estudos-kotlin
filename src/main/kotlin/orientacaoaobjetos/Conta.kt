package org.example.orientacaoaobjetos

class Conta(saldo: Double = 100.0, nomeTitular: String = "", agencia: String = "0001", codigo: String = "") {
    var saldo: Double
    var nomeTitular: String
        private set
    var agencia: String
    var codigo: String
    var documento: String? = null
    //variável com getter e com setter privado
    var chequeEspecial: Double = 0.0
        get() = saldo * 0.9
        private set

    var endereco: Endereco? = null

    init {
        this.saldo = saldo
        this.nomeTitular = nomeTitular
        this.agencia = agencia
        this.codigo = codigo
    }
}