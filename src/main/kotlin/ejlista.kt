import kotlin.random.Random

fun main() {

    val list = MutableList(100) {
        Random.nextInt(0, 10)
    }

    println(list)

    var cont = 0

    val listresultado = mutableListOf<Int>()

    for (i in 0..9) {
        for (element in list) {
            if (element==i){
                cont++
            }
        }
        listresultado.add(cont)
        cont=0
    }
 println(listresultado)

//SEGUNDO EJERCICIO

    val lista = listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")
     var suma =0.0
    var cadena = ""
    for (element in lista){
       if(element is Int || element is Double){
           suma+=element.toString().toDouble()
       } else{
           element.toString()
           cadena+=element
       }
    }

    println(suma)
    println(cadena)










}