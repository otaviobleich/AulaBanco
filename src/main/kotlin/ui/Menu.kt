package org.example.ui

fun menu(){
    println("1 - Cadastrar caixa de Agua")
    println("2 - Editar Caixa de Agua")
    println("3 - Listar Caixa de Agua")
    println("4 - Excluir Caixa de Agua")

    var opcao = readln().toInt()

    when(opcao){
        1 -> println("Cadastrando Caixa...")
        2 -> println("Editando Caixa...")
        3 -> println("Listando Caixa...")
        4 -> println("Excluindo Caixa...")
        else -> println("opcao invalida")
    }
}