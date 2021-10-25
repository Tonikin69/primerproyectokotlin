fun main(){
    { println("hola")}()
    var decirhola = { println("hello")}
    decirhola()
    var deciralgo = {algo : String, otracosa : Int -> println("Digo $algo $otracosa")}
    deciralgo("boom!",69)

    var sumar = {num1 : Int, num2 : Int -> num1+num2}
    println(sumar(5,5))

    var lambda ={letra : Char -> if (!letra.isDigit()) print(letra) }

    "p1e4z8".forEach(lambda)
    println("")
    var ejercicio1 = { println("Holax")}
    ejercicio1()
    var ejercicio2 = { numero :Int ->println("Holax $numero")}
    ejercicio2(69)
    var ejercicio3 = { numero :Int, lista :List<Any> ->println("Holax ${numero+lista.size}")}
    ejercicio3(3,listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?"))
    val ejercicio4 : (Int, List<Any>) -> Int = { integer: Int, listInteger: List<Any> -> integer + listInteger.size}
    println("El numero es ${ejercicio4(1,listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?"))}")

    val ciudades = listOf("Alicante", "Almería", "Barcelona", "Bilbao", "Burgos", "Cádiz", "Cartagena", "Córdoba", "Gerona"
        , "Gijón", "Granada", "Huelva", "Tenerife", "Ibiza", "Jerez", "Madrid", "Málaga", "Marbella", "Murcia", "Oviedo"
        , "Pamplona", "Ronda", "Salamanca", "San Sebastián", "Santander", "Santiago", "Sevilla", "Tarragona", "Toledo",
        "Valencia", "Zaragoza")

    // Crea una lista con todas las ciudades que tengan la letra "a" mayúscula o minuscule
    ejercicio1(ciudades).forEach{
        print("\"$it\",")
    }
    println()
    // Crea una lista de todas las ciudades que tengan la letra "a" mayúscula o minúscula. Las que tengan una "A"
    // deber ser mostradas en mayúsculas todas las letras.
    ejercicio2(ciudades).forEach{
        print("\"$it\",")
    }
    println()

    // Elimina de ciudades todas las ciudades que tengan 8 letras. Recuerda que tu lista es no Mutable
    ejercicio3(ciudades).forEach{
        print("\"$it\",")
    }
    println()
    // Escribe la lista de ciudades. Aquellas ciudades con una cantidad de letras impar al revés. Ej. Ibiza - azibI
    // Resultado esperado: [Alicante, aíremlA, anolecraB, Bilbao, Burgos, zidáC, anegatraC, abodróC, Gerona, nójiG, adanarG, Huelva, Tenerife, azibI, zereJ, Madrid, Málaga, Marbella, Murcia, Oviedo, Pamplona, adnoR, acnamalaS, náitsabeS naS, rednatnaS, Santiago, alliveS, anogarraT, Toledo, Valencia, Zaragoza]
    ejercicio4(ciudades).forEach{
        print("\"$it\",")
    }
    println()}

fun ejercicio1(ciudades: List<String>): List<String> {
    // También se puede hacer con expresiones regulares
    return ciudades.filter { it.contains("a") || it.contains("A") }
}

fun ejercicio2(ciudades: List<String>) : List<String> {
    val result = ejercicio1(ciudades).toMutableList()
    result.forEachIndexed { pos, item ->
        if (item.contains("A")) result[pos] = item.uppercase() }
    return result
}

fun ejercicio3(ciudades: List<String>): List<String> {
    return ciudades.filter { it.length != 8 }
}

fun ejercicio4(ciudades: List<String>): List<String> {
    val ciudadesMutable = ciudades.toMutableList()
    val ciudadesImpares = ciudades.filter { (it.length.rem(2) == 1) }
    ciudadesMutable.forEachIndexed{ index: Int, ciudad: String ->  if (ciudadesImpares.contains(ciudad)) ciudadesMutable[index] = ciudadesMutable[index].reversed() }
    return ciudadesMutable
}








