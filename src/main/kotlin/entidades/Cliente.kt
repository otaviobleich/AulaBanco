package org.example.entidades

class Cliente(
    nome: String,
    idade: Int,
    cpf: Long,
    sexo: String,
    val telefone: Long,
    val email: String,
    val endereco: String,
    val cidade : Array<String>
): Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo,
)
