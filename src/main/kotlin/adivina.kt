import java.lang.NumberFormatException
import kotlin.random.Random

fun main() {
    adivinarnumerox()
}
fun adivinarnumerox(){
    var numleido= readIntFromKeyboard()
    var aleatorio: Int = Random.nextInt(0, 9)
    var respuesta = false
    print(aleatorio)

    do {
        numleido=readIntFromKeyboard()

        if (numleido>aleatorio){
            println("Tu numero es mayor")
        } else if (aleatorio>numleido){
            println("Tu numero es menor")
        } else {
            println("Acertaste")
            respuesta=true
        }
    } while (respuesta == false)
}
fun getRandomNumberx(rango: IntRange): Int {
    return rango.random()
}

fun readIntFromKeyboard(): Int {
    var result : Int?
    do {
        val selectedOption = readLine()
        result = try {
            selectedOption?.toInt()
        } catch (e: NumberFormatException) {
            println("Lo que has introducido no es un número.")
            null
        }
    } while (result == null)
    return result
}