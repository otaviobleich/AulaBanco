package org.example.entidades

import org.example.enumeradores.Setor
import java.math.BigDecimal

class Funcionario(
    val nomeempresa: String = "fortlev",
    nome: String = "otavio",
    cpf: Long,
    val cargo: String = "furador de poço",
    val salario: String = BigDecimal(3000).toString(),
    val dataAdmissao: String = "12.04.2024",
    val telefone: String = "(12)23242-3423",
    val email: String = "fortlev@gmail.com",
    val endereco: String = "Rua alagoas",
    val ativo: String = "ativo",
    idade: Int,
    sexo: String,
    val habilidade: String,
    val setor: String,
) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo,
) {
    fun InstalarCaixaDagua(clt: Funcionario) {
        if (clt.setor.equals(Setor.MONTAGEM)) {
            println("Profissional habilitado")
        } else {
            println("Profissional desqualificado")
        }
    }
    fun receberconta(conta: Conta, aReceber: BigDecimal){
        val aPagar = null
    }
}