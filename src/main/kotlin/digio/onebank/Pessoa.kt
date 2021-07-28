package digio.onebank


class Pessoa {
    var nome: String = "Jam"
    var cpf: String = "12345678923"
}

fun main(){
    val jam = Pessoa()

    println(jam.nome)
    println(jam.cpf)
}
