import kotlin.random.Random

fun main() {
    var listresultado = mutableListOf<Jugadores>()
    var jugador1 = Jugadores()
    jugador1.nombre="Perro"
    jugador1.partidas=5
    jugador1.kills=10
    jugador1.deaths=5
    var jugador2 = Jugadores()
    jugador2.nombre="Gato"
    jugador2.partidas=20
    jugador2.kills=5
    jugador2.deaths=5



    var jugador3=Jugadores()
    println("Nombre: ")
    jugador3.nombre= readLine().toString()
    println("Partidas: ")
    jugador3.partidas= readLine()?.toInt() ?: 0
    println("Kills: ")
    jugador3.kills= readLine()?.toInt() ?: 0
    println("Muertes: ")
    jugador3.deaths= readLine()?.toInt() ?: 0

    listresultado.add(jugador1)
    listresultado.add(jugador2)
    listresultado.add(jugador3)


    listresultado.forEach(){
        it.Stringer()
    }


}
class Jugadores(){
    public var id=0
    public var nombre=""
    public var partidas=0

    public var kills=0
    public var deaths=0

    fun kd() :Float{
        var resultado=0.0
        resultado= (kills/deaths).toDouble()
        return resultado.toFloat()
    }
    fun Stringer(){
        print( "Nombre: "+ nombre + " Partidas: "+ partidas +" Kills: " + kills + " Muertes: "+ deaths +" Kd: "+ kd()+"\n")
    }
}