package digio.onebank.testes

import digio.onebank.Funcionario
import digio.onebank.Pessoa
import java.math.BigDecimal

fun main(){
    val jame = Pessoa(nome = "jame", cpf="12345678956")

    println(jame.nome)
    println(jame.cpf)

    val jam = Funcionario("Jameica","1235678956", BigDecimal.valueOf(2000.0))
    println(jam.nome)
    println(jam.cpf)
    println(jam.salario)
}