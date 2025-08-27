package org.example.entidades

import java.math.BigDecimal

class Servico(
    val funcionario: BigDecimal,
    val nomeServico: String = "instalaçãoCaixa",
    val descricao: String = "IntalaçãoCaixaDagua",
    val preco: Double = 2000.0,
    val dataInicio: String = "12.08.2025",
    val dataFim: String = "13.08.2025",
    val responsavel: String = "Otavio",
    val status: String = "inacabado",
    val tipoPrioridade: String = "privada",
    val cliente: String = "Uilson"
)