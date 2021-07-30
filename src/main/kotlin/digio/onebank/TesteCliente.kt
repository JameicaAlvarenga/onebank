package digio.onebank

import digio.onebank.testes.TesteAutenticacao

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "456.789.456.23",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)

}