package digio.onebank


class Pessoa {
    var nome: String = "Jam"
    var cpf: String = "123.456.789-23"
    private set
}

fun main(){
    val jame = Pessoa()

    println(jame.nome)
    println(jame.cpf)
}
