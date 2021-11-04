import kotlin.random.Random
val listresultado = mutableListOf<Participante>()
fun main() {

    repeat(100){
        var juga = Participante(it)
       listresultado.add(juga)
    }
    listresultado.sortBy { it.conter }


    println(mostrarResultado())


}
fun mostrarResultado(): String {
    var resultado=""
    for (i in listresultado.reversed()){
        resultado+="Jugador "+i.id+" ha sacado "+i.conter+ " puntos\n"
    }
    return resultado
}

class Dado (){
     private var numMin = 1
     private var numMax = 6

    constructor(numMin :Int, numMax :Int) : this(){
        this.numMin=numMin
        this.numMax=numMax
    }

    fun tiradaUnica (): Int {
        return Random.nextInt(numMin, numMax)
    }

}

class Participante (id :Int) {
    var id=id
    var conter = proceso()+proceso2()+proceso3()


    fun proceso() :Int{
        var tirada = Dado()
        repeat(100){
            conter+=tirada.tiradaUnica()
        }
        return conter
    }
    fun proceso2() :Int{
        var tirada2 = Dado(1,3)
        repeat(100){
            conter+=tirada2.tiradaUnica()
        }
        return conter
    }
    fun proceso3() :Int {
        var tirada3 = Dado(4, 6)
        repeat(100) {
            conter += tirada3.tiradaUnica()
        }
        return conter
    }

}
