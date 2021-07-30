package digio.onebank.testes

import digio.onebank.Analista
import digio.onebank.Funcionario
import digio.onebank.Pessoa
import java.math.BigDecimal

fun main() {
    val jam = Analista("Jameica", "1235678956", 2000.0)
    ImprimeRelatorioFuncionario.imprime(jam)
}




