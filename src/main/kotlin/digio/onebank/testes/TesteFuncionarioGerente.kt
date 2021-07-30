package digio.onebank.testes

import digio.onebank.Analista
import digio.onebank.Funcionario
import digio.onebank.Gerente
import digio.onebank.Pessoa
import java.math.BigDecimal

fun main() {
    val maria = Gerente("Maria do Carmo", "1235678956", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}





