package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val pedidos = mapOf(Pair(1,20.0), 3 to 50.0)
    println(pedidos)

    val podeserNull = pedidos[1]

    podeserNull?.let { println("Está presente?") }


    val myendereco = Endereco()

    Endereco(logradouro = "Rua da rua", cep = "12312").run {
       "$logradouro, $cep".toUpperCase()
    }.let {enderecoEmMaiusculo: String -> println(enderecoEmMaiusculo)}

    listOf(
        Endereco(complemento = "casa"),
        Endereco()
    ).filter { s -> s.complemento.isNotEmpty()}
        .let(::println)



    val age: IntArray = intArrayOf(25, 31, 32)

    age.forEachIndexed() { i, ages ->
        age[i] = ages * 15
    }

    println(age.contentToString())

    val contatos: Array<String> = Array<String>(3) { "" }

    contatos[0] = "Roberto"

    contatos[1] = "Ana"

    contatos[2] = "Paula"


    println(contatos.contentToString())


    //RANGES
    val alfabeto = 'a'..'z'
    val letra = 'z'
    println(letra in alfabeto)


    }







class MyExpection(mensagem: String = "É o nosso Erro!") : Exception(mensagem)
