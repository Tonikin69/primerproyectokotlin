import java.lang.NumberFormatException
import kotlin.random.Random

fun main() {
    for (f in 0..50) {
        println(generarPalabraAleatoria())
    }

}
fun generarPalabraAleatoria(): String{
    var respuesta :String =""
    var aleatoriomayuscula: Char = Random.nextInt(65, 90).toChar()
    respuesta+=aleatoriomayuscula


    for (i in 0..2){
        var aleatoriominuscula: Char = Random.nextInt(97, 122).toChar()
        respuesta+=aleatoriominuscula


    }

    return respuesta
}
