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
}