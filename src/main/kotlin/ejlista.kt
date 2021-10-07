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







}