package org.example.entidades
import java.math.BigDecimal

class CaixaDAgua(
    val capacidadeLitros: Int = 20000,
    val preço: BigDecimal,
    val material: Int,
    val alturaMetros: Double = 2.95,
    val diametroMetros: Double = 2.75,
    val cor: String = "azul",
    val pesoVazioKg: Int = 180,
    val nivelAtualLitros: Int = 20000,
    val tipoTampa: String = "plastico",
    val marca: String = "fortlev",
    val anoFabricacao: Int = 2025,
    val local: String
)
