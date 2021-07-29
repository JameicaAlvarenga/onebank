package digio.onebank.testes

import digio.onebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.decricao}" )
    }

    ClienteTipo.values().forEach {
                println("${it.name} - ${it.decricao}" )
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.decricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.decricao}")
}
