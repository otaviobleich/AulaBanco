package org.example.entidades
import org.example.enumeradores.Material
import java.math.BigDecimal

class CaixaDAgua(
    val capacidadeLitros: Int,
    val preco: BigDecimal,
    val material: Material,
    val alturaMetros: Double,
    val diametroMetros: Double = 2.75,
    val cor: String = "azul",
    val pesoVazioKg: Int = 180,
    val nivelAtualLitros: Int = 20000,
    val tipoTampa: String = "plastico",
    val marca: String = "fortlev",
    val anoFabricacao: Int = 2025,
    val local: String
)
