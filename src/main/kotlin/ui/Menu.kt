package org.example.ui

fun menu(){
    do{
        println("1 - Cadastrar caixa de Agua")
        println("2 - Editar Caixa de Agua")
        println("3 - Listar Caixa de Agua")
        println("4 - Excluir Caixa de Agua")
        println("0 - Sair")

        var opcao = readln().toInt()

        when(opcao){
            0 -> println("Adeus Amigo")
            1 -> println("Cadastrando Caixa...")
            2 -> println("Editando Caixa...")
            3 -> println("Listando Caixa...")
            4 -> println("Excluindo Caixa...")
            else -> println("opcao invalida")
        }
    }while (opcao !=0)

}