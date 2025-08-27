package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Material
import java.math.BigDecimal

fun cadastrarcaixa() {
    /*
    val pesoVazioKg: Int = 180,
    val tipoTampa: String = "plastico",
    val marca: String = "fortlev",
    val anoFabricacao: Int = 2025,
    val local: String
      Plastico, PVC, Fibra
    */

    println("Escolha o material")
    print("1 - Plastico")
    print("2 - PVC")
    print("3 - Fibra")
    val opcao = readln().toInt()
    var material: Material
    when(opcao){
        1 -> material = Material.PVC
        2 -> material = Material.Fibra
        3 -> material = Material.Plastico
        else -> material = Material.Plastico
    }

    println("capacidade da caixa em litros")
    val litros = readln().toDouble()

    println("alturaMetros da caixa em litros")
    val altura = readln().toDouble()

    println("preço da caixa em litros")
    val diametros = readln().toDouble()

    println("cor da caixa em litros")
    val cor = readln().toDouble()

    println("peso da caixa em litros")
    val peso = readln().toInt()

    println("tipoTampa da caixa em litros")
    val tipoTampa = readln().toDouble()

    println("marca da caixa em litros")
    val marca = readln()

    println("anoFabricacao da caixa em litros")
    val anoFabricacao = readln().toDouble()

    println("Valor")
    val valor = readln().toBigDecimal()

    println("local")
    val local = readln()

    println("capacidade")
    val capacidade = readln().toInt()

    CaixaDAgua(
        material = material,
        alturaMetros = altura,
        pesoVazioKg = peso,
        marca = marca,
        diametroMetros = diametros,
        preco = valor,
        local = local,
        capacidadeLitros = capacidade,

        )





}

fun editarcaixas(){

}

fun listarcaixar(){

}

fun excluircaixas(){

}